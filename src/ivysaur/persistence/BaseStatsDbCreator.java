package ivysaur.persistence;

import ivysaur.htmlParser.HtmlParser;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStatsDbCreator {

    SqliteConnector sqliteConnector;
    HtmlParser htmlParser;

    public BaseStatsDbCreator() {
        try {
            htmlParser = new HtmlParser();
            sqliteConnector = new SqliteConnector();
            sqliteConnector.connect("./db/pokemonBaseStat.db");
            createBaseStatTable();
            insertAllPokemonStats();
            sqliteConnector.closeConnection();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(BaseStatsDbCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createBaseStatTable() throws SQLException {
        sqliteConnector.createTable("BaseStats",
                new String[]{
                    "id INT,",
                    "name string,",
                    "healPoints INT,",
                    "attack INT,",
                    "defense INT,",
                    "specialAttack INT,",
                    "specialDefense INT,",
                    "speed INT,",
                    "image string,",
                    "primary key (name)"
                });
    }

    private void insertAllPokemonStats() throws SQLException {
        int i = 0;
        for (String s : htmlParser.getAttackString()) {

            sqliteConnector.insert("BaseStats", new String[]{
                        htmlParser.getIdString().get(i) + ",",
                        "'" + htmlParser.getNameString().get(i) + "',",
                        htmlParser.getHealPointsString().get(i) + ",",
                        htmlParser.getAttackString().get(i) + ",",
                        htmlParser.getDefenseString().get(i) + ",",
                        htmlParser.getSpecialAttackString().get(i) + ",",
                        htmlParser.getSpecialDefenseString().get(i) + ",",
                        htmlParser.getSpeedString().get(i) + ",",
                        "'" + htmlParser.getImagesString().get(i) + "'"
                    });
            i++;
        }
    }
}
