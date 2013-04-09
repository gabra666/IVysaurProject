package ivysaur;

import ivysaur.pokemon.BaseStat;
import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.IndividualValue;
import ivysaur.pokemon.Nature;
import ivysaur.pokemon.Stat;

public class Pokemon {

    private String imageUrl;
    private String Id;
    private String name;
    private BaseStat baseStats;
    private IndividualValue individualValues;
    private EffortValue effortValues;
    private Stat stats;
    private Nature nature;
    private int level;

    public Pokemon() {
    }

    public Pokemon(String imageUrl, String Id, String name, BaseStat baseStats, IndividualValue individualValues, EffortValue effortValues, Stat stats, Nature nature, int level) {
        this.imageUrl = imageUrl;
        this.Id = Id;
        this.name = name;
        this.baseStats = baseStats;
        this.individualValues = individualValues;
        this.effortValues = effortValues;
        this.stats = stats;
        this.nature = nature;
        this.level = level;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseStats(BaseStat baseStats) {
        this.baseStats = baseStats;
    }

    public void setIndividualValues(IndividualValue individualValues) {
        this.individualValues = individualValues;
    }

    public void setEffortValues(EffortValue effortValues) {
        this.effortValues = effortValues;
    }

    public void setStats(Stat stats) {
        this.stats = stats;
    }

    public String getId() {
        return Id;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }
    
    
    public void setLevel(int level) {
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public BaseStat getBaseStats() {
        return baseStats;
    }

    public IndividualValue getIndividualValues() {
        return individualValues;
    }

    public EffortValue getEffortValues() {
        return effortValues;
    }

    public Stat getStats() {
        return stats;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Nature getNature() {
        return nature;
    }

    public int getLevel() {
        return level;
    }
}
