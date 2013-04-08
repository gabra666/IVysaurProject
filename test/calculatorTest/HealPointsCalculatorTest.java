package calculatorTest;

import ivysaur.calculators.StatCalculator;
import ivysaur.pokemon.EffortValue;
import org.junit.Assert;
import org.junit.Test;

public class HealPointsCalculatorTest {

    //NEUTRAL NATURE
    @Test
    public void getRangeWithLevel1() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinHealPoints("Abra", 1, ev);
        int max = statCalculator.calculateMaxHealPoints("Abra", 1, ev);
        int[] actualRange = {min, max};
        int[] expectedRange = {11, 11};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }

    @Test
    public void getRangeWithLevel50() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinHealPoints("Abra", 50, ev);
        int max = statCalculator.calculateMaxHealPoints("Abra", 50, ev);
        int[] actualRange = {min, max};
        int[] expectedRange = {85, 100};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }

    @Test
    public void getRangeWithLevel100() {
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinHealPoints("Abra", 100, ev);
        int max = statCalculator.calculateMaxHealPoints("Abra", 100, ev);
        int[] actualRange = {min, max};
        int[] expectedRange = {160, 191};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
}
