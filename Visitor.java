// Visitor interface
public interface Visitor {
    void visit(Student student); // student recipient

    void visit(Professor professor); // professor recipient

    void visit(Office office); // office recipient
}
