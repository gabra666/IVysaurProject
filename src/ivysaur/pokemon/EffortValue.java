
package ivysaur.pokemon;

public class EffortValue {

    private int healPointsEv;
    private int attackEv;
    private int defenseEv;
    private int specialAttackEv;
    private int specialDefenseEv;
    private int speedEv;
    
    public EffortValue() {
        this.healPointsEv = 0;
        this.attackEv = 0;
        this.defenseEv = 0;
        this.specialAttackEv = 0;
        this.specialDefenseEv = 0;
        this.speedEv = 0;
    }

    public EffortValue(int healPointsEv, int attackEv, int defenseEv, int specialAttackEv, int specialDefenseEv, int speedEv) {
        this.healPointsEv = healPointsEv;
        this.attackEv = attackEv;
        this.defenseEv = defenseEv;
        this.specialAttackEv = specialAttackEv;
        this.specialDefenseEv = specialDefenseEv;
        this.speedEv = speedEv;
    }
    
    

    public void setHealPointsEv(int healPointsEv) {
        this.healPointsEv = healPointsEv;
    }

    public void setAttackEv(int attackEv) {
        this.attackEv = attackEv;
    }

    public void setDefenseEv(int defenseEv) {
        this.defenseEv = defenseEv;
    }

    public void setSpecialAttackEv(int specialAttackEv) {
        this.specialAttackEv = specialAttackEv;
    }

    public void setSpecialDefenseEv(int specialDefenseEv) {
        this.specialDefenseEv = specialDefenseEv;
    }

    public void setSpeedEv(int speedEv) {
        this.speedEv = speedEv;
    }

    public int getHealPointsEv() {
        return healPointsEv;
    }

    public int getAttackEv() {
        return attackEv;
    }

    public int getDefenseEv() {
        return defenseEv;
    }

    public int getSpecialAttackEv() {
        return specialAttackEv;
    }

    public int getSpecialDefenseEv() {
        return specialDefenseEv;
    }

    public int getSpeedEv() {
        return speedEv;
    }
    
    
    

}
