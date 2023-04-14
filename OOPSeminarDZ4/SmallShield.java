package OOPSeminarDZ4;

import java.util.Random;

public class SmallShield extends Defend {

    public int armor;

    public int getArmor() {
        return armor;
    }

    public SmallShield(int pointOfDefend, int armor) {
        super(pointOfDefend);
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("SmallShield [щит: " + armor + "]" + "броня: " + pointOfDefend);
    }

    @Override
    public int defend() {
        return new Random().nextInt(10, pointOfDefend);
    }
}
