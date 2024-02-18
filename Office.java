// office object
public class Office extends Acceptor {

    private String dept;

    // constructor to take department name
    public Office(String dept){
        this.dept = dept;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    // overriding the toString() method
    @Override
    public String toString(){
        return "office of " + dept + " department.";
    }
}
