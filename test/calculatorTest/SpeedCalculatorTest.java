package calculatorTest;

import ivysaur.calculators.StatCalculator;
import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.Nature;
import org.junit.Assert;
import org.junit.Test;

public class SpeedCalculatorTest {
    
    //NEUTRAL NATURE
    @Test
    public void getRangeWithNeutralNatureAndZeroEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.DOCILE);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.DOCILE);
        int[] actualRange ={min, max};
        int[] expectedRange={10,11};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    
    @Test
    public void getRangeWithNeutralNatureAndFullEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.DOCILE);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.DOCILE);
        int[] actualRange ={min, max};
        int[] expectedRange={12,13};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    
    
    //INCREASING NATURE
    @Test
    public void getRangeWithSpeedIncreasingNatureAndZeroEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.JOLLY);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.JOLLY);
        int[] actualRange ={min, max};
        int[] expectedRange={11,12};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    @Test
    public void getRangeWithSpeedIncreasingNatureAndFullEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.JOLLY);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.JOLLY);
        int[] actualRange ={min, max};
        int[] expectedRange={13,14};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    
    //DECREASING NATURE
    @Test
    public void getRangeWithSpeedDecreasingNatureAndZeroEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.BRAVE);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.BRAVE);
        int[] actualRange ={min, max};
        int[] expectedRange={9,9};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    @Test
    public void getRangeWithSpeedDecreasingNatureAndFullEv(){
        StatCalculator statCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        int min = statCalculator.calculateMinSpeed("Abra", 3, ev, Nature.BRAVE);
        int max = statCalculator.calculateMaxSpeed("Abra", 3, ev, Nature.BRAVE);
        int[] actualRange ={min, max};
        int[] expectedRange={10,11};
        Assert.assertArrayEquals(expectedRange, actualRange);
    }
    
    
    
    
}
