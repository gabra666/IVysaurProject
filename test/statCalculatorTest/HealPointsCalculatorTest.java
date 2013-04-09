package statCalculatorTest;

import ivysaur.Pokemon;
import ivysaur.calculators.StatCalculator;
import ivysaur.pokemon.EffortValue;
import org.junit.Assert;
import org.junit.Test;

public class HealPointsCalculatorTest {

   
    @Test
    public void getRangeWithLevel1() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        Pokemon abra = new Pokemon();
        abra.setName("Abra");
        abra.setLevel(1);
        abra.setEffortValues(ev);
        int min = statCalculator.calculateMinHealPoints(abra);
        int max = statCalculator.calculateMaxHealPoints(abra);
        int[] actualRange = {min, max};
        int[] expectedRange = {11, 11};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }

    @Test
    public void getRangeWithLevel50() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        Pokemon abra = new Pokemon();
        abra.setName("Abra");
        abra.setLevel(50);
        abra.setEffortValues(ev);
        int min = statCalculator.calculateMinHealPoints(abra);
        int max = statCalculator.calculateMaxHealPoints(abra);
        int[] actualRange = {min, max};
        int[] expectedRange = {85, 100};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }

    @Test
    public void getRangeWithLevel100() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
       Pokemon abra = new Pokemon();
        abra.setName("Abra");
        abra.setLevel(100);
        abra.setEffortValues(ev);
        int min = statCalculator.calculateMinHealPoints(abra);
        int max = statCalculator.calculateMaxHealPoints(abra);
        int[] actualRange = {min, max};
        int[] expectedRange = {160, 191};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
}
