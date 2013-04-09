package ivysaur.calculators;

import ivysaur.Pokemon;
import ivysaur.persistance.BaseStatsManager;

public class StatCalculator {

    private BaseStatsManager baseStatManager;

    public StatCalculator() {
        baseStatManager = new BaseStatsManager();
    }

    // floor((2*BaseHP + HPIV + floor(EV/4) + 100)*Level/100 + 10)==HP_Stat
    public int calculateHealPointStat(Pokemon pokemon, int iv) {
        double value = (2 * baseStatManager.getBaseHealPoints(pokemon.getName()) + iv + 
                pokemon.getEffortValues().getHealPointsEv() / 4 + 100) * pokemon.getLevel() / 100 + 10;
        return (int) value;
    }

    public int calculateMaxHealPoints(Pokemon pokemon) {
        return calculateHealPointStat(pokemon, 31);
    }

    public int calculateMinHealPoints(Pokemon pokemon) {
        return calculateHealPointStat(pokemon, 0);
    }

    // floor((2*BaseAtk + AtkIV + floor(EV/4))*Level/100 + 5)* Nature ==Atk_Stat
    private int calculateStat(int baseStat, int level, int ev, double natureValue, int iv) {
        double value = ((2 * baseStat + iv + ev / 4) * level / 100 + 5) * natureValue;
        return (int) value;
    }
    //BASICS

    public int calculateAttack(Pokemon pokemon, int iv) {
        return calculateStat(baseStatManager.getBaseAttack(pokemon.getName()),
                pokemon.getLevel(), pokemon.getEffortValues().getAttackEv(),
                pokemon.getNature().getAttack(), iv);
    }

    public int calculateDefense(Pokemon pokemon, int iv) {
        return calculateStat(baseStatManager.getBaseDefense(pokemon.getName()),
                pokemon.getLevel(), pokemon.getEffortValues().getDefenseEv(),
                pokemon.getNature().getDefense(), iv);
    }

    public int calculateSpecialAttack(Pokemon pokemon, int iv) {
        return calculateStat(baseStatManager.getBaseSpecialAttack(pokemon.getName()),
                pokemon.getLevel(), pokemon.getEffortValues().getSpecialAttackEv(),
                pokemon.getNature().getSpecialAttack(), iv);
    }

    public int calculateSpecialDefense(Pokemon pokemon, int iv) {
        return calculateStat(baseStatManager.getBaseSpecialDefense(pokemon.getName()),
                pokemon.getLevel(), pokemon.getEffortValues().getSpecialDefenseEv(),
                pokemon.getNature().getSpecialDefense(), iv);
    }

    public int calculateSpeed(Pokemon pokemon, int iv) {
        return calculateStat(baseStatManager.getBaseSpeed(pokemon.getName()),
                pokemon.getLevel(), pokemon.getEffortValues().getSpeedEv(),
                pokemon.getNature().getSpeed(), iv);
    }

    //MAX AND MIN
    public int calculateMaxAttack(Pokemon pokemon) {
        return calculateAttack(pokemon, 31);
    }

    public int calculateMinAttack(Pokemon pokemon) {
        return calculateAttack(pokemon, 0);
    }

    public int calculateMaxDefense(Pokemon pokemon) {
        return calculateDefense(pokemon, 31);
    }

    public int calculateMinDefense(Pokemon pokemon) {
        return calculateDefense(pokemon, 0);
    }
    public int calculateMaxSpecialAttack(Pokemon pokemon) {
        return calculateSpecialAttack(pokemon, 31);
    }

    public int calculateMinSpecialAttack(Pokemon pokemon) {
        return calculateSpecialAttack(pokemon, 0);
    }

    public int calculateMaxSpecialDefense(Pokemon pokemon) {
        return calculateSpecialDefense(pokemon, 31);
    }

    public int calculateMinSpecialDefense(Pokemon pokemon) {
        return calculateSpecialDefense(pokemon, 0);
    }
    
    public int calculateMaxSpeed(Pokemon pokemon) {
        return calculateSpeed(pokemon, 31);
    }

    public int calculateMinSpeed(Pokemon pokemon) {
        return calculateSpeed(pokemon, 0);
    }

}
