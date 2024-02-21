// mailing system implementation
public class sendMail_Visitor implements Visitor {

    @Override
    public void visit(Student student) {
        System.out.println("Sending mail to " + student.getName() + ".");
        // additional mailing logic for student can be added here

        System.out.println("This is a student from the " + student.getDept() + " department.");
    }

    @Override
    public void visit(Professor professor) {
        System.out.println("Sending mail to " + professor.getName() + ".");
        // additional mailing logic for professor can be added here

        System.out.println("This is a professor from the " + professor.getDept() + " department.");
    }

    @Override
    public void visit(Office office) {
        System.out.println("Sending mail to the " + office.getDepartment() + " office.");
        // additional mailing logic for office can be added here

        System.out.println("This office is present in room no. " + office.getRoomNo() + ".");
    }

    // example implementation of the mailing system
    public static void main(String[] args) {
        Acceptor[] acceptors = { new Student("Uzair Mukadam", "Software Engineering"),
                new Professor("Yiming Tang", "Software Engineering", 2604), new Office("Software Engineering", 1730) };

        sendMail_Visitor mail_Visitor = new sendMail_Visitor();

        for (Acceptor acceptor : acceptors) {
            acceptor.accept(mail_Visitor);
        }
    }
}
