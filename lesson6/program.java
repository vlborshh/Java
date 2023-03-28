package lesson6;

import java.lang.reflect.Field;

public class program {
    public static void main(String[] args) {

        Person[] personsArray = new Person[10];
        personsArray[0] = new Person(1, 23, "Стрельцов", "Иван", "+79876543210",
                "Мужской", "Петрова 4/4");
        personsArray[1] = new Person(2, 15, "Павлов", "Павел", "+79876543211",
                "Мужской", "проспект Мира 17/69");
        personsArray[2] = new Person(3, 35, "Павлова", "Мария", "+79876543212",
                "Женский", "проспект Мира 17/69");
        personsArray[3] = new Person(4, 35, "Павлова", "Мария", "+79876543212",
                "Женский", "проспект Мира 17/69");

        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i] != null) {
                System.out.println(personsArray[i].toString());
            }
        }
        System.out.println("Person'ны старше 20 лет: ");
        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i] != null) {
                if (personsArray[i].getAge() > 20) {
                    System.out.println(personsArray[i].toString());
                }
            }
        }
    }
}
