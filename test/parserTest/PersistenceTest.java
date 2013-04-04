package parserTest;

import ivysaur.persistence.BaseStatsDbCreator;
import org.junit.Test;

public class PersistenceTest {
    private BaseStatsDbCreator BaseStatsDbCreator;
    
    @Test
    public void creatingSqliteDataBaseTest(){
    
        BaseStatsDbCreator = new BaseStatsDbCreator();
        System.out.println("Done");
    }
}
