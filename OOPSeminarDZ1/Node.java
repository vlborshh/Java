package OOPSeminarDZ1;

public class Node {
    Relatives parent;
    Status status;
    Relatives children;

    public Node(Relatives parent, Relatives children) {
        this.parent = parent;
        this.status = Status.children;
        this.children = children;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.children, this.status, this.parent);
    }

}
