// professor object
public class Professor extends Acceptor {

    private String name;
    private String dept;

    // constructor to take professor and department name
    public Professor(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    // overriding the toString() method
    @Override
    public String toString(){
        return name + ", professor of " + dept + " department.";
    }
}
