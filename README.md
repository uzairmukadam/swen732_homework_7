# Visitor Pattern Implementation

The Visitor pattern is a behavioral design pattern that allows you to define new operations without modifying existing object structures. It’s particularly useful when you have a fixed object structure (such as a composite) and want to add new functionality without altering the existing classes.

In this example, we created a simple mailing system using the Visitor pattern. We have three types of recipients: the students, the professors, and the office. Each recipient will receive a mail based on their type.

## Classes Overview

- Visitor: An interface defining the visit methods for different recipient types.
- Acceptor: An interface defining the accept method for each recipient type.
- Student, Professor, and Office: Concrete classes representing different recipients.
- sendMail_Visitor: Concrete class that contains the main logic for mailing.

## Visitor

The Visitor interface defines the visit methods for different recipient types.

```
    void visit(Student student); // student recipient
    void visit(Professor professor); // professor recipient
    void visit(Office office); // office recipient
```

## Acceptor

Each concrete recipient class (Student, Professor, and Office) implements the Acceptor interface and overrides the accept method.

## sendMail_Visitor

The SendMailVisitor class demonstrates how the mailing system works by visiting each recipient.

For each each individual recipient we can implement custom logic easily.
```
    @Override
    public void visit(Student student) {
        System.out.println("Sending mail to " + student);
        // additional mailing logic for student can be added here
    }
```