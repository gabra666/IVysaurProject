package ivysaur.calculators;

import ivysaur.Pokemon;

public class IvCalculator {

    private StatCalculator statCalculator;

    public IvCalculator() {
        statCalculator = new StatCalculator();
    }

    public void getPokemonIv(Pokemon pokemon) {
        calculateHealPointsIV(pokemon);
        calculateAttackIV(pokemon);
        calculateDefenseIV(pokemon);
        calculateSpecialAttackIV(pokemon);
        calculateSpecialDefenseIV(pokemon);
        calculateSpeedIV(pokemon);
    }
    
    private void calculateHealPointsIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateHealPointStat(pokemon, i) == pokemon.getStats().getHealPoints()) {
               pokemon.getIndividualValues().addHealPointIv(i);
            }
        }
    }
    

    private void calculateAttackIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateAttack(pokemon,i ) == pokemon.getStats().getAttack()) {
                pokemon.getIndividualValues().addAttackIv(i);
            }
        }
    }
    private void calculateDefenseIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateDefense(pokemon,i ) == pokemon.getStats().getDefense()) {
                pokemon.getIndividualValues().addDefenseIv(i);
            }
        }
    }
    private void calculateSpecialAttackIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateSpecialAttack(pokemon,i ) == pokemon.getStats().getSpecialAttack()) {
                pokemon.getIndividualValues().addSpecialAttackIv(i);
            }
        }
    }
    private void calculateSpecialDefenseIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateSpecialDefense(pokemon,i ) == pokemon.getStats().getSpecialDefense()) {
                pokemon.getIndividualValues().addSpecialDefenseIv(i);
            }
        }
    }
    private void calculateSpeedIV(Pokemon pokemon) {
        for (int i = 0; i <= 31; i++) {
            if (statCalculator.calculateSpeed(pokemon,i ) == pokemon.getStats().getSpeed()) {
                pokemon.getIndividualValues().addSpeedIv(i);
            }
        }
    }

}
