package calc;

import java.util.Scanner;

import calc.parser.ArgsParser;
import calc.parser.CalcStringParser;
import calc.parser.CorrectionParser;
import calc.parser.MIstakeParser;

public class Main {
    public static void main(String[] args) {

        final ArgsParser parser = new CorrectionParser(new MIstakeParser());
        final CalcStringParser calcStringParser = new CalcStringParser(parser);
        final Calculator calculator = new Calculator(calcStringParser);

        System.out.println("Калькулятор для работы с рациональными и комплексными числами...");
        System.out.println("успел реализовать только сложение и вычитание.  ");
        System.out.println("символы раздеять пробелами при вводе");

        while (true) {
            System.out.println("Введите выражение: ");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String strArray[] = str.split(" ");
            calculator.calculate(strArray);

            System.out.println("Продолжить вычисления - 1");
            System.out.println("Прекратить работу программы - 2");
            in = new Scanner(System.in);
            int num = in.nextInt();
            if (num == 2) {
                break;
            }

        }

    }
}
