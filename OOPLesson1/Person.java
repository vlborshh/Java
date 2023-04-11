package OOPLesson1;

public class Person {
    private String name;
    private String status;
    private Integer age;

    public Person(String personName, int personAge) {
        this.age = personAge;
        this.name = personName;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s, возраст: %d, статус: %s", name, age, status);
    }
}
