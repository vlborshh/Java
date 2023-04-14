package OOPSeminarDZ4;

import java.util.Random;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Defendable defend;
    protected static Random rand = new Random();

    public Warrior(String name, int healthPoint, Weaponable weapon, Defendable defend) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defend = defend;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Defendable getDefend() {
        return defend;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public boolean isAlive() {
        return healthPoint > 0;
    }

    public void reduceHp(int damage) {

        if (damage < defend.defend()) {
            damage = 0;
        }
        healthPoint = healthPoint - damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior [" + name + ", здоровье: " + healthPoint + ", оружие: " + weapon + ", общая защита: "
                + defend + "]";
    }

}
