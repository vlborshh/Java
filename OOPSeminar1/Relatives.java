package OOPSeminar1;

public class Relatives extends People {
    private String dateDeath;
    private Integer idLevel;
    private String id;

    public Relatives(People relativesPeople, String relativesDataDeath, Integer relativesIdLevel) {
        super(relativesPeople.getName(), relativesPeople.getGender(), relativesPeople.getDataBirth());
        this.dateDeath = relativesDataDeath;
        this.idLevel = relativesIdLevel;

    }

    public Relatives(People relativesPeople, Integer relativesIdLevel) {
        super(relativesPeople.getName(), relativesPeople.getGender(), relativesPeople.getDataBirth());
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
        return String.format("ФИО: %s, пол: %s, дата рождения: %s, дата смерти: %s, ид: %s, идУровень: %s",
                super.getName(),
                super.getGender(),
                super.getDataBirth(), this.dateDeath, this.id, this.idLevel);
    }
}
