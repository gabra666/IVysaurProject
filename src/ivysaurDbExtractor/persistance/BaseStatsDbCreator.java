package ivysaurDbExtractor.persistance;

import ivysaurDbExtractor.HtmlExtractor.HtmlExtractor;

public class BaseStatsDbCreator {

    SqliteConnector sqliteConnector;
    HtmlExtractor htmlParser;

    public BaseStatsDbCreator(){
        htmlParser = new HtmlExtractor();
        sqliteConnector = new SqliteConnector();
    }

    private void createBaseStatTable(){
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

    private void insertAllPokemonStats(){
        for (int i=0; i < htmlParser.getAttackString().size(); i++) {
            sqliteConnector.insert("BaseStats", getParams(i));            
        }
    }

    public void createDataBase() {
        sqliteConnector.connect("../IVysaurDB/IVysaur.db");
        createBaseStatTable();
        insertAllPokemonStats();
        sqliteConnector.closeConnection();
    }

    private String[] getParams(int i) {
        return new String[]{
                    htmlParser.getIdString().get(i) + ",",
                    "'" + htmlParser.getNameString().get(i) + "',",
                    htmlParser.getHealPointsString().get(i) + ",",
                    htmlParser.getAttackString().get(i) + ",",
                    htmlParser.getDefenseString().get(i) + ",",
                    htmlParser.getSpecialAttackString().get(i) + ",",
                    htmlParser.getSpecialDefenseString().get(i) + ",",
                    htmlParser.getSpeedString().get(i) + ",",
                    "'" + htmlParser.getImagesString().get(i) + "'"
                };
    }
}
