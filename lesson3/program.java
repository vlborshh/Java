package lesson3;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int b = 20;
        for (int i = 1; i < b; i++) {
            array.add(i);
        }
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) % 2) == 0) {
                array.remove(i);
            }
        }
        System.out.println(array);

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value", "14"));
        System.out.println(list);
        String str = "";
        int i = 0;
        int size = list.size();
        while (i < size) {
            str = list.get(i);
            try {
                int j = Integer.parseInt(str);
                list.remove(i);
                size--;
                i--;
            } catch (NumberFormatException nfe) {

            }
            i++;
        }

        System.out.println(list);
    }
}
