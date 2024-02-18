// mailing system implementation
public class sendMail_Visitor implements Visitor {

    @Override
    public void visit(Student student) {
        System.out.println("Sending mail to " + student);
        // additional mailing logic for student can be added here
    }

    @Override
    public void visit(Professor professor) {
        System.out.println("Sending mail to " + professor);
        // additional mailing logic for professor can be added here
    }

    @Override
    public void visit(Office office) {
        System.out.println("Sending mail to the " + office);
        // additional mailing logic for office can be added here
    }

    // example implementation of the mailing system
    public static void main(String[] args) {
        Acceptor[] acceptors = { new Student("Uzair Mukadam", "Software Engineering"),
                new Professor("Yiming Tang", "Software Engineering"), new Office("Software Engineering") };

        sendMail_Visitor mail_Visitor = new sendMail_Visitor();

        for (Acceptor acceptor : acceptors) {
            acceptor.accept(mail_Visitor);
        }
    }
}
