package OOPSeminarDZ4;

public class main {
    public static void main(String[] args) {

        Team<Swordmen> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordmen("Иван", 250, new Sword(25), new SmallShield(30, 30)))
                .addWarriorToTeam(new Swordmen("Петр", 200, new Sword(30), new SmallShield(50, 30)));
        for (Swordmen swordmen : team1) {
            System.out.println(swordmen);
        }
        System.out.println("минимальный щит члена команды в команде: " + team1.minTeamArmor());
        System.out.println("-------------------------------------------------");

        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Миша", 150, new Bow(30, 200), new BigShield(100)))
                .addWarriorToTeam(new Archer("Саша", 130, new Bow(20, 250), new BigShield(150)));
        for (Archer archer : team2) {
            System.out.println(archer);
        }
        System.out.println("минимальный щит члена команды в команде: " + team2.minTeamArmor());
        System.out.println("-------------------------------------------------");

        Archer archer1 = new Archer("Миша", 100, new Bow(20, 200), new BigShield(5));
        Archer archer2 = new Archer("Саша", 100, new Bow(15, 250), new BigShield(6));

        Battle fight = new Battle(archer1, archer2);

        fight.run();
    }

}