package lesson6;

import java.util.Objects;

public class Person {
    int idPerson;
    String surname;
    String name;
    String phoneNumber;
    int age;
    String gender;
    String addres;

    Person(int personIdPerson, int personAge, String personSurname, String personName, String personPhoneNumber,
            String personGender, String personAddres) {
        idPerson = personIdPerson;
        age = personAge;
        surname = personSurname;
        name = personName;
        phoneNumber = personPhoneNumber;

        gender = personGender;
        addres = personAddres;

    }

    public int getId() {
        return idPerson;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getAddres() {
        return addres;
    }

    @Override
    public String toString() {
        return String.format("[%d] ФИО: %s %s,тел.: %s, возраст: %d, пол: %s, адрес: %s", idPerson, surname, name,
                phoneNumber, age, gender,
                addres);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        return idPerson == anotherPerson.idPerson && age == anotherPerson.age && surname.equals(anotherPerson.surname)
                && name.equals(anotherPerson.name) && phoneNumber.equals(anotherPerson.phoneNumber)
                && gender.equals(anotherPerson.gender) && addres.equals(anotherPerson.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, age, surname, name, phoneNumber, gender, addres);
    }
}
