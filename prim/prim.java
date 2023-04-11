package prim;

import java.util.LinkedList;

public class prim {

    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");
        int j = 1;
        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(j, str2);

        System.out.println(earlBio);

    }

}
