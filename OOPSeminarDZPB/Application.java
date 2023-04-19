package OOPSeminarDZPB;

import java.util.Scanner;

public class Application {
    public static void start() {
        View view = new ConsoleView();
        Controler controler = new Controler(view,
                "D:/GB/java/OOPSeminarDZPB/phonebook.txt");
        controler.LoadFromFile();

        try (Scanner input = new Scanner(System.in)) {
            boolean bool = true;
            while (bool) {
                System.out.println(
                        "1 - Предыдущая запись \n2 - Следующая запись \n3 - Добавить контакт \n4 - Удалить контакт \n5 - Сохранить \n6 - Выход");
                String num = input.next();

                switch (num) {
                    case "1":
                        controler.prev();
                        break;
                    case "2":
                        controler.next();
                        break;
                    case "3":
                        controler.add();
                        break;
                    case "4":
                        controler.remove();
                        break;
                    case "5":
                        controler.saveToFile();
                        break;
                    case "6":
                        bool = false;
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}
