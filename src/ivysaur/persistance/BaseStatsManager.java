package ivysaur.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStatsManager {

    private DBConnector connector;

    public BaseStatsManager() {
        connector = new SqliteConnector();
    }

    public int getId(String pokemonName) {
        return getBaseStat("id", pokemonName);
    }
    
    public int getBaseHealPoints(String pokemonName) {
        return getBaseStat("healPoints", pokemonName);
    }

    public int getBaseAttack(String pokemonName) {
        return getBaseStat("attack", pokemonName);
    }

    public int getBaseDefense(String pokemonName) {
        return getBaseStat("defense", pokemonName);
    }

    public int getBaseSpecialAttack(String pokemonName) {
        return getBaseStat("specialAttack", pokemonName);
    }

    public int getBaseSpecialDefense(String pokemonName) {
        return getBaseStat("specialDefense", pokemonName);
    }

    public int getBaseSpeed(String pokemonName) {
        return getBaseStat("speed", pokemonName);
    }
    
    private int getBaseStat(String baseStat, String pokemonName) {
        try {
            int baseStatInt;
            connector.connect("../IVysaurDB/IVysaur.db");
            try (ResultSet baseStatResult = connector.selectColumnFromConditional(baseStat, "BaseStats", "name = \""+ pokemonName+"\"")) {
                baseStatInt = baseStatResult.getInt(baseStat);
            }
            connector.closeConnection();
            return baseStatInt;
        } catch (SQLException ex) {
            Logger.getLogger(BaseStatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public String getImage(String pokemonName) {
        try {
            String imageUrl;
            connector.connect("../IVysaurDB/IVysaur.db");
            ResultSet imageResult = connector.selectColumnFromConditional("image", "BaseStats", "name = \""+ pokemonName+"\"");
            imageUrl = imageResult.getString("image");
            imageResult.close();
            connector.closeConnection();
            return imageUrl;
        } catch (SQLException ex) {
            Logger.getLogger(BaseStatsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
