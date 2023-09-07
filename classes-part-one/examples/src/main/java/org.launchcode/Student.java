package org.launchcode;

public class Student {

    // Instance variables or fields (properties have public setters, generally). Can be read or changed by anything within the same package if they have no access modifiers. So we're changing them to private.
    private String name;
    private int studentID;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // Getters and setters

    // getter - gets the value of the private instance variable 'name'.
    public String getName() {
        return name;
    }

    // setter - sets the value of the private instance variable 'name'. A setter doesn't have to have a corresponding field.

    public void setName(String aName) {
        name = aName;
    }

}
