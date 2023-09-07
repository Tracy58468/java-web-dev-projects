package org.launchcode;

public class HelloWorld {

    // class field public (usable anywhere)
//    public String message = "Hello World";

    // class field private (only needs to be used by sayHello) (have to use getters and setters to use it elsewhere)

    private String message = "Hello private World";

    // class method
//    public void sayHello() {
//
//        System.out.println("First method: " + message);
//
//    }

    // another way of creating the method (generally a good idea to use this way instead of the other way)
    public void sayHello() {

        System.out.println("Second method: " + this.message);

    }



}

/*// Constructor

public class HelloWorld {

    private String message = "Hello World";

    public HelloWorld(String message) {
        this.message = message;
    }

    // Getters and setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

}*/
