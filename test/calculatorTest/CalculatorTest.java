package calculatorTest;

import ivysaur.calculators.StatCalculator;
import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.Nature;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    public CalculatorTest() {
    }

    @Test
    public void maxHealStatTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(15, ivCalculator.getMaxHealPoints("Abra", 3, new EffortValue()));
    }

    @Test
    public void minHealStatTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(14, ivCalculator.getMinHealPoints("Abra", 3, new EffortValue()));
    }

    @Test
    public void minSpeedWithSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(11, ivCalculator.getMinSpeed("Abra", 3, new EffortValue(), Nature.JOLLY));
    }

    @Test
    public void minSpeedWithOutSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(10, ivCalculator.getMinSpeed("Abra", 3, new EffortValue(), Nature.ADAMANT));
    }
    
    @Test
    public void minSpeedWithSpeedNatureAndFullEvTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        Assert.assertEquals(13, ivCalculator.getMinSpeed("Abra", 3,ev , Nature.JOLLY));
    }

    @Test
    public void minSpeedWithOutSpeedNatureAndFullEvTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        Assert.assertEquals(12, ivCalculator.getMinSpeed("Abra", 3, ev, Nature.ADAMANT));
    }
    public void maxSpeedWithSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(12, ivCalculator.getMaxSpeed("Abra", 3, new EffortValue(), Nature.JOLLY));
    }

    @Test
    public void maxSpeedWithOutSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        Assert.assertEquals(11, ivCalculator.getMaxSpeed("Abra", 3, new EffortValue(), Nature.ADAMANT));
    }
    
    @Test
    public void maxSpeedWithSpeedNatureAndFullEvTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        Assert.assertEquals(14, ivCalculator.getMaxSpeed("Abra", 3,ev , Nature.JOLLY));
    }

    @Test
    public void maxSpeedWithOutSpeedNatureAndFullEvTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(255);
        Assert.assertEquals(13, ivCalculator.getMaxSpeed("Abra", 3, ev, Nature.ADAMANT));
    }
    
    @Test
    public void maxSpeedWithDecreasingSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(0);
        Assert.assertEquals(194, ivCalculator.getMaxSpeed("Abra", 100, ev, Nature.BRAVE));
    }
    @Test
    public void minSpeedWithDecreasingSpeedNatureTest() {
        StatCalculator ivCalculator = new StatCalculator();
        EffortValue ev = new EffortValue();
        ev.setSpeedEv(0);
        Assert.assertEquals(166, ivCalculator.getMinSpeed("Abra", 100, ev, Nature.BRAVE));
    }
}
