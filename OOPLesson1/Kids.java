package OOPLesson1;

public abstract class Kids extends Parents {

    public Kids(Status status, Person person) {
        super(status, person);
    }

    public Status getStatus() {
        return super.getStatus();
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s, возраст: %d, статус: %s", super.getName(),
                super.getAge(), getStatus());
    }
}
