package ivysaur.pokemon;

import java.util.ArrayList;

public class IndividualValue {

    private ArrayList<Integer> healPointsIv;
    private ArrayList<Integer> attackIv;
    private ArrayList<Integer> defenseIv;
    private ArrayList<Integer> specialAttackIv;
    private ArrayList<Integer> specialDefenseIv;
    private ArrayList<Integer> speedIv;

    public IndividualValue() {
        healPointsIv = new ArrayList<>();
        attackIv = new ArrayList<>();
        defenseIv = new ArrayList<>();
        specialAttackIv = new ArrayList<>();
        specialDefenseIv = new ArrayList<>();
        speedIv = new ArrayList<>();
    }

    public void addHealPointIv(int iv) {
        healPointsIv.add(iv);
    }

    public void addAttackIv(int iv) {
        attackIv.add(iv);
    }

    public void addDefenseIv(int iv) {
        defenseIv.add(iv);
    }

    public void addSpecialAttackIv(int iv) {
        specialAttackIv.add(iv);
    }

    public void addSpecialDefenseIv(int iv) {
        specialDefenseIv.add(iv);
    }

    public void addSpeedIv(int iv) {
        speedIv.add(iv);
    }

    public ArrayList<Integer> getHealPointsIv() {
        return healPointsIv;
    }

    public ArrayList<Integer> getAttackIv() {
        return attackIv;
    }

    public ArrayList<Integer> getDefenseIv() {
        return defenseIv;
    }

    public ArrayList<Integer> getSpecialAttackIv() {
        return specialAttackIv;
    }

    public ArrayList<Integer> getSpecialDefenseIv() {
        return specialDefenseIv;
    }

    public ArrayList<Integer> getSpeedIv() {
        return speedIv;
    }
}
