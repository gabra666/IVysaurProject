package ivysaur.calculators;

import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.Nature;
import ivysaurDbExtractor.persistance.BaseStatsManager;

public class StatCalculator {

    private BaseStatsManager baseStatManager;

    public StatCalculator() {
        baseStatManager = new BaseStatsManager();
    }

    // floor((2*BaseHP + HPIV + floor(EV/4) + 100)*Level/100 + 10)==HP_Stat
    public int getHealPointStat(String pokemonName, int level, EffortValue ev, int iv) {
        return (int) Math.floor(
                (2 * baseStatManager.getBaseHealPoints(pokemonName) + iv
                + Math.floor(ev.getHealPointsEv() / 4) + 100)
                * level / 100 + 10);
    }

    public int getMaxHealPoints(String pokemonName, int level, EffortValue ev) {
        return getHealPointStat(pokemonName, level, ev, 31);
    }

    public int getMinHealPoints(String pokemonName, int level, EffortValue ev) {
        return getHealPointStat(pokemonName, level, ev, 0);
    }

    // floor((2*BaseAtk + AtkIV + floor(EV/4))*Level/100 + 5)* Nature ==Atk_Stat
    public int getStat(int baseStat, int level, int ev, int iv, double natureValue) {
        return (int) Math.floor(((2 * baseStat + iv + Math.floor(ev / 4)) * level / 100 + 5) * natureValue);
    }

    public int getMaxAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseAttack(pokemonName), level, ev.getAttackEv(), 31, nature.getAttack());
    }

    public int getMinAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseAttack(pokemonName), level, ev.getAttackEv(), 0, nature.getAttack());
    }

    public int getMaxDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseDefense(pokemonName), level, ev.getDefenseEv(), 31, nature.getDefense());
    }

    public int getMinDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseDefense(pokemonName), level, ev.getDefenseEv(), 0, nature.getDefense());
    }

    public int getMaxSpecialAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpecialAttack(pokemonName), level, ev.getSpecialAttackEv(), 31, nature.getSpecialAttack());
    }

    public int getMinSpecialAttack(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpecialAttack(pokemonName), level, ev.getSpecialAttackEv(), 0, nature.getSpecialAttack());
    }

    public int getMaxSpecialDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpecialDefense(pokemonName), level, ev.getSpecialDefenseEv(), 31, nature.getSpecialDefense());
    }

    public int getMinSpecialDefense(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpecialDefense(pokemonName), level, ev.getSpecialDefenseEv(), 0, nature.getSpecialDefense());
    }

    public int getMaxSpeed(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpeed(pokemonName), level, ev.getSpeedEv(), 31, nature.getSpeed());
    }

    public int getMinSpeed(String pokemonName, int level, EffortValue ev, Nature nature) {
        return getStat(baseStatManager.getBaseSpeed(pokemonName), level, ev.getSpeedEv(), 0, nature.getSpeed());
    }
}
