package OOPSeminarDZ4.Shield;

import OOPSeminarDZ4.Defendable;

public abstract class Defend implements Defendable {
    protected int pointOfDefend;

    public Defend(int pointOfDefend) {
        this.pointOfDefend = pointOfDefend;
    }

}
