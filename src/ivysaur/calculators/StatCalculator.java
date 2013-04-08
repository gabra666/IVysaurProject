package ivysaur.calculators;

import ivysaur.persistance.BaseStatsManager;
import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.Nature;

public class StatCalculator {

    private BaseStatsManager baseStatManager;

    public StatCalculator() {
        baseStatManager = new BaseStatsManager();
    }

    // floor((2*BaseHP + HPIV + floor(EV/4) + 100)*Level/100 + 10)==HP_Stat
    public int calculateHealPointStat(String pokemonName, int level, EffortValue ev, int iv) {
        double valor = (2 * baseStatManager.getBaseHealPoints(pokemonName) + iv + ev.getHealPointsEv() / 4 + 100) * level / 100 + 10;
        return (int) valor;
    }

    public int calculateMaxHealPoints(String pokemonName, int level, EffortValue ev) {
        return calculateHealPointStat(pokemonName, level, ev, 31);
    }

    public int calculateMinHealPoints(String pokemonName, int level, EffortValue ev) {
        return calculateHealPointStat(pokemonName, level, ev, 0);
    }

    // floor((2*BaseAtk + AtkIV + floor(EV/4))*Level/100 + 5)* Nature ==Atk_Stat
    public int calculateStat(int baseStat, int level, int ev, int iv, double natureValue) {
        double valor = ((2 * baseStat + iv + ev / 4) * level / 100 + 5) * natureValue;
        return (int) valor;
    }
    //BASICS
    public int calculateAttack(String pokemonName, int level, EffortValue ev, int iv, Nature nature) {
        return calculateStat(baseStatManager.getBaseAttack(pokemonName), level, ev.getAttackEv(), iv, nature.getAttack());
    }

    public int calculateDefense(String pokemonName, int level, EffortValue ev, int iv, Nature nature) {
        return calculateStat(baseStatManager.getBaseDefense(pokemonName), level, ev.getDefenseEv(), iv, nature.getDefense());
    }

    public int calculateSpecialAttack(String pokemonName, int level, EffortValue ev, int iv, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialAttack(pokemonName), level, ev.getSpecialAttackEv(), iv, nature.getSpecialAttack());
    }

    public int calculateSpecialDefense(String pokemonName, int level, EffortValue ev, int iv, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialDefense(pokemonName), level, ev.getSpecialDefenseEv(), iv, nature.getSpecialDefense());
    }

    public int calculateSpeed(String pokemonName, int level, EffortValue ev, int iv, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpeed(pokemonName), level, ev.getSpeedEv(), iv, nature.getSpeed());
    }

    //MAX AND MIN
    public int calculateMaxAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseAttack(pokemonName), level, ev.getAttackEv(), 31, nature.getAttack());
    }

    public int calculateMinAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseAttack(pokemonName), level, ev.getAttackEv(), 0, nature.getAttack());
    }

    public int calculateMaxDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseDefense(pokemonName), level, ev.getDefenseEv(), 31, nature.getDefense());
    }

    public int calculateMinDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseDefense(pokemonName), level, ev.getDefenseEv(), 0, nature.getDefense());
    }

    public int calculateMaxSpecialAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialAttack(pokemonName), level, ev.getSpecialAttackEv(), 31, nature.getSpecialAttack());
    }

    public int calculateMinSpecialAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialAttack(pokemonName), level, ev.getSpecialAttackEv(), 0, nature.getSpecialAttack());
    }

    public int calculateMaxSpecialDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialDefense(pokemonName), level, ev.getSpecialDefenseEv(), 31, nature.getSpecialDefense());
    }

    public int calculateMinSpecialDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpecialDefense(pokemonName), level, ev.getSpecialDefenseEv(), 0, nature.getSpecialDefense());
    }

    public int calculateMaxSpeed(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpeed(pokemonName), level, ev.getSpeedEv(), 31, nature.getSpeed());
    }

    public int calculateMinSpeed(String pokemonName, int level, EffortValue ev, Nature nature) {
        return calculateStat(baseStatManager.getBaseSpeed(pokemonName), level, ev.getSpeedEv(), 0, nature.getSpeed());
    }
}
