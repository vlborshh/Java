package OOPSeminarDZPB;

import java.io.*;

public class Model {
    PhoneBook thisPhoneBook;
    private int thisIndex;
    private String path;

    public Model(String path) {
        thisPhoneBook = new PhoneBook();
        thisIndex = 0;
        this.path = path;
    }

    public Contact ThisContact() {
        if (thisIndex >= 0) {
            return thisPhoneBook.getContact(thisIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String firstName = bufferedReader.readLine();
            while (firstName != null) {
                String lastName = bufferedReader.readLine();
                String phoneNumber = bufferedReader.readLine();
                this.thisPhoneBook.add(new Contact(firstName, lastName, phoneNumber));
                firstName = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            for (int i = 0; i < thisPhoneBook.count(); i++) {
                Contact contact = thisPhoneBook.getContact(i);
                fileWriter.append(String.format("%s\n", contact.firstName));
                fileWriter.append(String.format("%s\n", contact.lastName));
                fileWriter.append(String.format("%s\n", contact.phoneNumber));
            }
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public PhoneBook getThisPhoneBook() {
        return this.thisPhoneBook;
    }

    public int getThisIndex() {
        return this.thisIndex;
    }

    public void setThisIndex(int index) {
        this.thisIndex = index;
    }

}
