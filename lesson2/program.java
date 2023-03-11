package lesson2;

import java.io.*;

public class program {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int n = 10;
        int j = 0;
        String c1 = "a";
        String c2 = "b";
        String str = "";

        while (j < n) {
            str = str + c1 + c2;
            j = j + 2;
        }
        System.out.println(str);

        System.out.println("Задание №2");
        try (FileWriter writer = new FileWriter("file.txt", true)) {
            // запись всей строки
            String text = "TEXT";
            for (int i = 0; i < 100; i++) {
                writer.write(text);
                writer.write('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
