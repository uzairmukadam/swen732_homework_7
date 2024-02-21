// professor object
public class Professor extends Acceptor {

    private String name;
    private String dept;
    private int room_no;

    // constructor to take professor and department name
    public Professor(String name, String dept, int room_no) {
        this.name = name;
        this.dept = dept;
        this.room_no = room_no;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // getter for professor name
    public String getName() {
        return name;
    }

    // getter for department name
    public String getDept() {
        return dept;
    }

    // getter for room no
    public int getRoom_no() {
        return room_no;
    }

    // overriding the toString() method
    @Override
    public String toString() {
        return name + ", professor of " + dept + " department.";
    }
}
