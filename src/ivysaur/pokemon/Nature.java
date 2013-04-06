package ivysaur.pokemon;

public class Nature {

    private double attack;
    private double defense;
    private double specialAttack;
    private double specialDefense;
    private double speed;
    //ATTACK NATURE
    public final static Nature HARDY = new Nature(1, 1, 1, 1, 1);
    public final static Nature LONELY = new Nature(1.1, 0.9, 1, 1, 1);
    public final static Nature BRAVE = new Nature(1.1, 1, 1, 1, 0.9);
    public final static Nature ADAMANT = new Nature(1.1, 1, 0.9, 1, 1);
    public final static Nature NAUGHTY = new Nature(1.1, 1, 1, 0.9, 1);
    //DEFENSE NATURE
    public final static Nature BOLD = new Nature(0.9, 1.1, 1, 1, 1);
    public final static Nature DOCILE = new Nature(1, 1, 1, 1, 1);
    public final static Nature RELAXED = new Nature(1, 1.1, 1, 1, 0.9);
    public final static Nature IMPISH = new Nature(1, 1.1, 0.9, 1, 1);
    public final static Nature LAX = new Nature(1, 1.1, 1, 0.9, 1);
    //SPEED NATURE
    public final static Nature TIMID = new Nature(0.9, 1, 1, 1, 1.1);
    public final static Nature HASTY = new Nature(1, 0.9, 1, 1, 1.1);
    public final static Nature SERIOUS = new Nature(1, 1, 1, 1, 1);
    public final static Nature JOLLY = new Nature(1, 1, 0.9, 1, 1.1);
    public final static Nature NAIVE = new Nature(1, 1, 1, 0.9, 1.1);
    //SP.ATTACK NATURE
    public final static Nature MODEST = new Nature(0.9, 1, 1.1, 1, 1);
    public final static Nature MILD = new Nature(1, 0.9, 1.1, 1, 1);
    public final static Nature QIUET = new Nature(1, 1, 1.1, 1, 0.9);
    public final static Nature BASHFUL = new Nature(1, 1, 1, 1, 1);
    public final static Nature RASH = new Nature(1, 1, 1.1, 0.9, 1);
    //SP.DEFENSE NATURE
    public final static Nature CALM = new Nature(0.9, 1, 1, 1.1, 1);
    public final static Nature GENTLE = new Nature(1, 0.9, 1, 1.1, 1);
    public final static Nature SASSY = new Nature(1, 1, 1, 1.1, 0.9);
    public final static Nature CAREFUL = new Nature(1, 1, 0.9, 1.1, 1);
    public final static Nature QUIRKY = new Nature(1, 1, 1, 1, 1);

    private Nature(double attack, double defense, double specialAttack, double specialDefense, double speed) {

        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public double getSpecialAttack() {
        return specialAttack;
    }

    public double getSpecialDefense() {
        return specialDefense;
    }

    public double getSpeed() {
        return speed;
    }
}
