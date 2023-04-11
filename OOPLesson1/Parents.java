package OOPLesson1;

public abstract class Parents {
    private Status status;
    private Person person;

    public Parents(Status personStatus, Person person) {
        this.person = person;
        this.status = personStatus;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return person.getName();
    }

    public Integer getAge() {
        return person.getAge();
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s, возраст: %d, статус: %s", person.getName(), person.getAge(), status);
    }

}
