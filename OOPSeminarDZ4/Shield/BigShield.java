package OOPSeminarDZ4.Shield;

import java.util.Random;

public class BigShield extends Defend {
    public BigShield(int pointOfDefend) {
        super(pointOfDefend);
    }

    @Override
    public int defend() {
        return new Random().nextInt(0, pointOfDefend);
    }

    @Override
    public String toString() {
        return String.format("броня: " + defend());
    }

}
