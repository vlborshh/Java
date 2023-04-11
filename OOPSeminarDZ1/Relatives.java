package OOPSeminarDZ1;

public class Relatives extends People implements Printer {
    private String dateDeath;
    private Integer idLevel;
    private String id;

    public Relatives(String relativesName, String relativesGender,
            String relativesDataBirth, String relativesDataDeath, Integer relativesIdLevel) {
        super(relativesName, relativesGender, relativesDataBirth);
        this.dateDeath = relativesDataDeath;
        this.idLevel = relativesIdLevel;

    }

    public Relatives(String relativesName, String relativesGender,
            String relativesDataBirth, Integer relativesIdLevel) {
        super(relativesName, relativesGender, relativesDataBirth);
        this.dateDeath = "----";
        this.idLevel = relativesIdLevel;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = Integer.toString(idLevel) + super.getGender();
    }

    public String getDateDeath() {
        return dateDeath;
    }

    public Integer getIdLevel() {
        return idLevel;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s", super.getName());
    }

    // реализация метода display из интерфейса Printer
    public void display() {
        System.out.printf("ФИО: %s, пол: %s, дата рождения: %s, дата смерти: %s",
                super.getName(),
                super.getGender(),
                super.getDataBirth(), this.dateDeath);
        System.out.println();
    }
}
