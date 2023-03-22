package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class program {
    public static void main(String[] args) {

        Map<Integer, String> sortMap = new HashMap<>();

        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] mass = str.split(" ");
        String str2 = "";
        int length1 = 0;
        int length2 = 0;
        for (int i = 0; i < mass.length; i++) {
            str = mass[i];
            if (!mass[i].equals("")) {
                length1 = str.length();
                for (int j = i + 1; j < mass.length; j++) {
                    length2 = mass[j].length();
                    if (length1 == length2) {
                        str = str + " " + mass[j];
                        mass[j] = "";
                        str2 = mass[j];
                    }

                }
            }
            if (!str.equals("")) {
                sortMap.put(length1 - 1, str);
            }
        }
        for (int i = 0; i < sortMap.size(); i++) {
            if (sortMap.get(i) != null) {
                System.out.println(sortMap.get(i));
            }
        }

    }
}
