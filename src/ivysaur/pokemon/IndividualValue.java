package ivysaur.pokemon;

public class IndividualValue {

    private int healPointsIv;
    private int attackIv;
    private int defenseIv;
    private int specialAttackIv;
    private int specialDefenseIv;
    private int speedIv;

    public IndividualValue(int healPointsIv, int attackIv, int defenseIv, int specialAttackIv, int specialDefenseIv, int speedIv) {
        this.healPointsIv = healPointsIv;
        this.attackIv = attackIv;
        this.defenseIv = defenseIv;
        this.specialAttackIv = specialAttackIv;
        this.specialDefenseIv = specialDefenseIv;
        this.speedIv = speedIv;
    }

    public void setHealPointsIv(int healPointsIv) {
        this.healPointsIv = healPointsIv;
    }

    public void setAttackIv(int attackIv) {
        this.attackIv = attackIv;
    }

    public void setDefenseIv(int defenseIv) {
        this.defenseIv = defenseIv;
    }

    public void setSpecialAttackIv(int specialAttackIv) {
        this.specialAttackIv = specialAttackIv;
    }

    public void setSpecialDefenseIv(int specialDefenseIv) {
        this.specialDefenseIv = specialDefenseIv;
    }

    public void setSpeedIv(int speedIv) {
        this.speedIv = speedIv;
    }

    public int getHealPointsIv() {
        return healPointsIv;
    }

    public int getAttackIv() {
        return attackIv;
    }

    public int getDefenseIv() {
        return defenseIv;
    }

    public int getSpecialAttackIv() {
        return specialAttackIv;
    }

    public int getSpecialDefenseIv() {
        return specialDefenseIv;
    }

    public int getSpeedIv() {
        return speedIv;
    }
}
