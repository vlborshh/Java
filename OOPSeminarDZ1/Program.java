package OOPSeminarDZ1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Relatives> relative = new ArrayList<>();
        People people = new People("Иван", "м", "1950");
        Relatives relatives = new Relatives(people, "2018", 1);
        relatives.setId();
        relative.add(relatives);

        people = new People("Наталья", "ж", "1960");
        relatives = new Relatives(people, 1);
        relatives.setId();
        relative.add(relatives);

        people = new People("Михаил", "м", "1982");
        relatives = new Relatives(people, 2);
        relatives.setId();
        relative.add(relatives);

        people = new People("Инна", "ж", "1993");
        relatives = new Relatives(people, 2);
        relatives.setId();
        relative.add(relatives);

        people = new People("Мария", "ж", "2001");
        relatives = new Relatives(people, 2);
        relatives.setId();
        relative.add(relatives);

        for (int i = 0; i < relative.size(); i++) {
            System.out.println(relative.get(i));
        }
        System.out.println("_______________________________");
        System.out.println("_______________________________");
        FamilyTies familyTies = new FamilyTies();
        familyTies.append(relative.get(0), relative.get(2));
        familyTies.append(relative.get(1), relative.get(3));
        familyTies.append(relative.get(0), relative.get(4));

        for (int i = 0; i < familyTies.getSize(); i++) {
            System.out.println(familyTies.getTree(i));
            System.out.println("_______________________________");
        }

    }
}
