package calc;

import java.io.FileWriter;
import java.io.IOException;

import calc.operation.Operation;
import calc.parser.CalcStringParser;

public class Calculator {
    private static final String startResultString = "Результат: ";
    private CalcStringParser calcStringParser;

    public Calculator(CalcStringParser calcStringParser) {
        this.calcStringParser = calcStringParser;
    }

    public void calculate(String[] calcArgs) {
        final Operation operation = calcStringParser.parse(calcArgs);
        System.out.println(startResultString + operation.operate());

        try (FileWriter writer = new FileWriter("log.txt", true)) {
            Number num = operation.operate();
            String text = String.valueOf(num);
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
