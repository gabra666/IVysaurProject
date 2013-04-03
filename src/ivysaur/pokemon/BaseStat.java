
package ivysaur.pokemon;

public class BaseStat {

    private int baseHealPoints;
    private int baseAttack;
    private int baseDefense;
    private int baseSpecialAttack;
    private int baseSpecialDefense;
    private int baseSpeed;

    public BaseStat() {
    }

    public BaseStat(int baseHealPoints, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed) {
        this.baseHealPoints = baseHealPoints;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpecialAttack = baseSpecialAttack;
        this.baseSpecialDefense = baseSpecialDefense;
        this.baseSpeed = baseSpeed;
    }

    public void setBaseHealPoints(int baseHealPoints) {
        this.baseHealPoints = baseHealPoints;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public void setBaseSpecialAttack(int baseSpecialAttack) {
        this.baseSpecialAttack = baseSpecialAttack;
    }

    public void setBaseSpecialDefense(int baseSpecialDefense) {
        this.baseSpecialDefense = baseSpecialDefense;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getBaseHealPoints() {
        return baseHealPoints;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public int getBaseSpecialAttack() {
        return baseSpecialAttack;
    }

    public int getBaseSpecialDefense() {
        return baseSpecialDefense;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }
}
