package ivysaurDbExtractorTest;

import ivysaur.dataExtractor.BaseStatsDbCreator;
import ivysaur.persistance.BaseStatsManager;
import junit.framework.Assert;
import org.junit.Test;

public class ExtractorPersistenceTest {
    private BaseStatsDbCreator BaseStatsDbCreator;
    
    //@Test
    public void creatingSqliteDataBaseTest(){
        BaseStatsDbCreator = new BaseStatsDbCreator();
        BaseStatsDbCreator.createDataBase();
    }
    
    @Test
    public void consultingBaseAttackTest(){
        BaseStatsManager manager= new BaseStatsManager();
        Assert.assertEquals(105,manager.getBaseSpecialAttack("Abra"));
    }
    
    @Test
    public void consultingBaseDefenseTest(){
        BaseStatsManager manager= new BaseStatsManager();
        Assert.assertEquals(40,manager.getBaseDefense("Nidoran♂"));
    }
    
    @Test
    public void consultingImageTest(){
        BaseStatsManager manager= new BaseStatsManager();
        Assert.assertEquals("http://cdn.bulbagarden.net/upload/f/fb/032MS.png",manager.getImage("Nidoran♂"));
    }
    
}
