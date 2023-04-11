package OOPSeminar1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        People people = new People("Иван", "м", "1950");
        Relatives relatives = new Relatives(people, 1);
        relatives.setId();

        ArrayList<ArrayList<Relatives>> listLevel = new ArrayList<>();
        ArrayList<Relatives> arrayRelatives = new ArrayList<>(2);

        arrayRelatives.add(relatives);

        people = new People("Наталья", "ж", "1960");
        relatives = new Relatives(people, 1);
        relatives.setId();
        arrayRelatives.add(relatives);

        listLevel.add(arrayRelatives);

        for (int i = 0; i < listLevel.size(); i++) {
            System.out.println(listLevel.get(i));
            System.out.println("-------------------");
        }
        System.out.println("-------------------");

        arrayRelatives.clear();

        people = new People("Инна", "ж", "1987");
        relatives = new Relatives(people, 1);
        relatives.setId();
        arrayRelatives.add(relatives);
        people = new People("Михаил", "м", "1985");
        relatives = new Relatives(people, 1);
        relatives.setId();
        arrayRelatives.add(relatives);

        // listLevel.add(arrayRelatives);

        // Почему происходит запись в listLevel если я в строке 42 закоментил эту
        // запись...
        // Почему перезаписывает первую запись строка 23 и добавляет текущую если
        // разкоментить 42 строку

        for (int i = 0; i < listLevel.size(); i++) {
            System.out.println(listLevel.get(i));
            System.out.println("-------------------");
        }
        System.out.println("-------------------");

        // for (int i = 0; i < listLevel.size(); i++) {
        // System.out.println(listLevel.get(i));
        // System.out.println("-------------------");
        // }

    }

    // static int arrayRelative(String str) {
    // if (str == "м") {
    // return 0;
    // } else {
    // return 1;
    // }
    // }
}
