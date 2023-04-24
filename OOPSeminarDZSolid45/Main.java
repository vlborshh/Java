package OOPSeminarDZSolid45;

public class Main {
    public static void main(String[] args) {
        Line line = new Line();
        line.drawLine();

        ModelForm f = new ModelForm(1, "Линия");
        WebFram w = new WebFram();
        w.save(f);

    }
}
