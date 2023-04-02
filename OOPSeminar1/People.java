package OOPSeminar1;

public class People {
    private String name;
    private String gender;
    private String dataBirth;

    public People(String peopleName, String peopleGender, String peopleDataBirth) {
        this.name = peopleName;
        this.gender = peopleGender;
        this.dataBirth = peopleDataBirth;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDataBirth() {
        return dataBirth;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s, пол: %s, дата рождения: %s", name, gender, dataBirth);
    }
}
