
package ivysaur.calculators;

import ivysaur.pokemon.EffortValue;
import ivysaur.pokemon.IndividualValue;

public class IvCalculator {
    
    private StatCalculator statCalculator;
    private IndividualValue iv;

    public IvCalculator() {
        iv = new IndividualValue();
        statCalculator = new StatCalculator();
    }
    
    
    public void calculateHealPointsIV(String pokemonName,int level, EffortValue ev,int HealPoints){
        for(int i=0; i <=31 ;i++)
            if(statCalculator.calculateHealPointStat(pokemonName, level, ev, i) == HealPoints) 
                iv.addHealPointIv(i);
    }
    
    public void calculateStatIV(String pokemonName,int level, EffortValue ev,int HealPoints){
        for(int i=0; i <=31 ;i++)
            if(statCalculator.(pokemonName, level, ev, i) == HealPoints) 
                iv.addHealPointIv(i);
    }
      
}
