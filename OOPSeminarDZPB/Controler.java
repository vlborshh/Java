package OOPSeminarDZPB;

public class Controler {
    private Model model;
    private View view;

    public Controler(View view, String pathDB) {
        this.view = view;
        model = new Model(pathDB);
    }

    public void LoadFromFile() {
        model.load();

        if (model.getThisPhoneBook().count() > 0) {
            model.setThisIndex(0);
            Contact contact = model.ThisContact();
            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setPhoneNumber(contact.phoneNumber);
        }
    }

    public void add() {
        model.getThisPhoneBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getPhoneNumber()));
    }

    public void remove() {
        Contact contact = model.ThisContact();
        model.getThisPhoneBook().remove(contact);
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.getThisPhoneBook().count() > 0) {
            if (model.getThisIndex() + 1 < model.getThisPhoneBook().count()) {
                model.setThisIndex(model.getThisIndex() + 1);
                Contact contact = model.ThisContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setPhoneNumber(contact.phoneNumber);
            }
        }
    }

    public void prev() {
        if (model.getThisPhoneBook().count() > 0) {
            if (model.getThisIndex() - 1 > -1) {
                model.setThisIndex(model.getThisIndex() - 1);
                Contact contact = model.ThisContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setPhoneNumber(contact.phoneNumber);
            }
        }
    }
}
