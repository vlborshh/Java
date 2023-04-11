package OOPLesson1;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Петр", 26);
        Parents parent = new Parents(Status.parents, person);
        // System.out.println(parent);

        Person person2 = new Person("Иван", 6);
        // System.out.println(person2);
        Kids kid = new Kids(Status.children, person2);
        System.out.println(kid);
        if (Status.parents == parent.getStatus()) {
            System.out.printf("(%s) является родителем (%s)", parent, kid);
        }

    }

}
