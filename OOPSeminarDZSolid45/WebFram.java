package OOPSeminarDZSolid45;

public class WebFram {
    public void save(InterfaceForm modelForm) {
        ISQL db = new MySQL();
        db.save(modelForm);
    }
}
