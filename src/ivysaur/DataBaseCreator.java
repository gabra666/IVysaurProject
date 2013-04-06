package ivysaur;

import ivysaurDbExtractor.persistance.BaseStatsDbCreator;

public class DataBaseCreator {

    private BaseStatsDbCreator BaseStatsDbCreator;

    
    public void createBaseStatDataBase() {
        BaseStatsDbCreator = new BaseStatsDbCreator();
        BaseStatsDbCreator.createDataBase();
    }
}
