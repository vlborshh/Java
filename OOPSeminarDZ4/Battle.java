package OOPSeminarDZ4;

public class Battle {
    private Warrior attacker;
    private Warrior definder;

    public Battle(Warrior attacker, Warrior definder) {
        this.attacker = attacker;
        this.definder = definder;
    }

    public Warrior run() {
        while (true) {
            int attack = attacker.harm();
            definder.reduceHp(attack);
            System.out.printf("Боец %s нанес %d урона бойцу %s %d здоровья осталось\n", attacker.getName(), attack,
                    definder.getName(), definder.getHealthPoint());
            if (!definder.isAlive()) {
                System.out.printf("Боец %s мертв, %s победитель", definder.getName(), attacker.getName());
                return attacker;
            }
            attack = definder.harm();
            attacker.reduceHp(attack);
            System.out.printf("Боец %s контатаковал на %d урона бойца %s %d здоровья осталось\n", definder.getName(),
                    attack,
                    attacker.getName(), attacker.getHealthPoint());
            if (!attacker.isAlive()) {
                System.out.printf("Боец %s мертв, %s победитель", attacker.getName(), definder.getName());
                return definder;
            }
        }
    }
}
