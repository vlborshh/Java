package OOPSeminarDZ1;

import java.util.ArrayList;

import static OOPSeminarDZ1.DisplayFamilyTies.displayInfo;

public class FamilyTies {
    private Integer size;
    private ArrayList<Node> tree = new ArrayList<>();

    public void append(Relatives parent, Relatives children) {
        tree.add(new Node(parent, children));
        size = tree.size();
    }

    public Integer getSize() {
        return size;
    }

    public Node getTree(Integer i) {
        return tree.get(i);
    }

    public void display(Integer i) {
        displayInfo(getTree(i));

    }
}
