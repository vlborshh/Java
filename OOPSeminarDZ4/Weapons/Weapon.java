package OOPSeminarDZ4.Weapons;

import OOPSeminarDZ4.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }

}
