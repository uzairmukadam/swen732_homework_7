// student object
public class Student extends Acceptor {

    private String name;
    private String dept;

    // constructor to take student and department name
    public Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    // overriding the toString() method
    @Override
    public String toString() {
        return name + ", student of " + dept + " department.";
    }
}
