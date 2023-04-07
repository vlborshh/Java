package OOPSeminarDZ1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Relatives> relative = new ArrayList<>();
        Relatives relatives = new Relatives("Иван", "м", "1950", "2018", 1);
        relatives.setId();
        relative.add(relatives);

        relatives = new Relatives("Наталья", "ж", "1960", "2019", 1);
        relatives.setId();
        relative.add(relatives);

        relatives = new Relatives("Михаил", "м", "1983", 2);
        relatives.setId();
        relative.add(relatives);

        relatives = new Relatives("Инна", "ж", "1991", 2);
        relatives.setId();
        relative.add(relatives);

        for (int i = 0; i < relative.size(); i++) {
            relative.get(i).display();
        }

        System.out.println("_______________________________");
        System.out.println("_______________________________");
        System.out.println();

        FamilyTies familyTies = new FamilyTies();
        familyTies.append(relative.get(0), relative.get(2));
        familyTies.append(relative.get(1), relative.get(3));

        for (int i = 0; i < familyTies.getSize(); i++) {
            familyTies.display(i);
            System.out.println("_______________________________");
        }
    }
}
