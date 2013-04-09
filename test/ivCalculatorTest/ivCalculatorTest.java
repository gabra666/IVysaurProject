
package ivCalculatorTest;

import ivysaur.Pokemon;
import ivysaur.calculators.IvCalculator;
import ivysaur.calculators.StatCalculator;
import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.IndividualValue;
import ivysaur.pokemon.Nature;
import ivysaur.pokemon.Stat;
import org.junit.Assert;
import org.junit.Test;

public class ivCalculatorTest {
    
    @Test
    public void getDragoniteIV() {
        IvCalculator ivCalculator = new IvCalculator();
        Stat stat= new Stat(321, 403, 191, 216, 219, 259);
        EffortValue ev = new EffortValue(6,255,0,0,0,255);
        IndividualValue iv = new IndividualValue();
        Pokemon dragonite = new Pokemon();
        dragonite.setName("Dragonite");
        dragonite.setLevel(100);
        dragonite.setStats(stat);
        dragonite.setEffortValues(ev);
        dragonite.setIndividualValues(iv);
        dragonite.setNature(Nature.LONELY);
        ivCalculator.getPokemonIv(dragonite);
        String actualRange = dragonite.getIndividualValues().getAttackIv().toString();
        String expectedRange = "[31]";
        Assert.assertEquals(expectedRange, actualRange);
    }
    @Test
    public void getWalreinIV() {
        IvCalculator ivCalculator = new IvCalculator();
        Stat stat= new Stat(298, 123, 139, 233, 158, 124);
        EffortValue ev = new EffortValue(252,0,0,252,0,6);
        IndividualValue iv = new IndividualValue();
        Pokemon walrein = new Pokemon();
        walrein.setName("Walrein");
        walrein.setLevel(74);
        walrein.setStats(stat);
        walrein.setEffortValues(ev);
        walrein.setIndividualValues(iv);
        walrein.setNature(Nature.MILD);
        ivCalculator.getPokemonIv(walrein);
        String actualRange = walrein.getIndividualValues().getDefenseIv().toString();
        String expectedRange = "[23, 24]";
        Assert.assertEquals(expectedRange, actualRange);
    }
}
