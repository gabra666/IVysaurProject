package ivysaur.persistance;

import ivysaur.dataExtractor.BaseStatsDbCreator;

public class DataBaseCreator {

    private BaseStatsDbCreator BaseStatsDbCreator;

    public void createBaseStatDataBase() {
        BaseStatsDbCreator = new BaseStatsDbCreator();
        BaseStatsDbCreator.createDataBase();
    }
}
