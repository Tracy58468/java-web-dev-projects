package org.launchcode;

public class Student {

    // Instance variables or fields (properties have public setters, generally). Can be read or changed by anything within the same package if they have no access modifiers. So we're changing them to private.
    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    // Constructors

    // first constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }

    // second constructor (overloaded)
    public Student(String name, int studentId) {

        // first way of setting variables
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;

        this(name, studentId, 0, 0); // better way to set second constructor
    }

    // increment nextStudentId (Instance method)
    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    // Report GPA (Instance method)
    public String studentInfo() {
        return (this.name + " has a GPA of " + this.gpa + ".");
    }


    // Getters and setters

    // getter - gets the value of the private instance variable 'name'.
    public String getName() {
        return name;
    }

    // setter - sets the value of the private instance variable 'name'. A setter doesn't have to have a corresponding field.

    public void setName(String aName) {
        name = aName;
    }

    // Update numberOfCredits and gpa
    public void addGrade(int courseCredits, double grade) {

    }

    // Determine grade level based on numberOfCredits
    public String getGradeLevel() {

    }

    public String toString() {

        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    Student person = new Student("Violet");
    System.out.println(person.toString());
}
