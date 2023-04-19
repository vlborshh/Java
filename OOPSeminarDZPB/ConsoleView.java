package OOPSeminarDZPB;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner consoleInput;

    public ConsoleView() {
        consoleInput = new Scanner(System.in);
    }

    @Override
    public String getFirstName() {
        System.out.printf("Фамилия: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("Фамилия: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("Имя: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("Имя: %s\n", value);
    }

    @Override
    public String getPhoneNumber() {
        System.out.printf("Номер телефона: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setPhoneNumber(String value) {
        System.out.printf("Номер телефона: %s\n", value);
    }
}
