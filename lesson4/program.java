package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        LinkedList<String> list_words = new LinkedList<>();
        int i = 0;
        while (i != 1) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String[] words = str.split("~");
            int j = 0;
            try {
                j = Integer.parseInt(words[1]);
            } catch (Exception e) {
                j = 1;
            }
            if (words[0].equals("print")) {
                // Выводим в консоль
                System.out.println(list_words.get(j - 1));
            } else if (words[0].equals("exit")) {
                // выходим из цикла
                i = 1;
            } else {
                // записываем в список
                list_words.add(j - 1, words[0]);
            }

        }
        System.out.println("Результат:");
        System.out.println(list_words);
    }

}
