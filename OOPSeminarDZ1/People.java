package OOPSeminarDZ1;

public abstract class People {
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

    // public abstract void display();

}
