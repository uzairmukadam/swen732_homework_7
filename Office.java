// office object
public class Office extends Acceptor {

    private String dept;
    private int room_no;

    // constructor to take department name
    public Office(String dept, int room_no) {
        this.dept = dept;
        this.room_no = room_no;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // getter for department name
    public String getDepartment() {
        return dept;
    }

    // getter for room no
    public int getRoomNo() {
        return room_no;
    }

    // overriding the toString() method
    @Override
    public String toString() {
        return "office of " + dept + " department.";
    }
}
