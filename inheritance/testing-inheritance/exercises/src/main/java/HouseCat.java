public class HouseCat extends Cat {

    /** Fields **/

    private String name;
    private String species = "Felis cattus";

    /** Constructor **/

    public HouseCat(String aName, double aWeight) {
        super(aWeight); // Tells Java to use the parent class' constructor property
        name = aName; // added property
    }

    /** Constructor calling the no-argument additional constructor in Cat **/

    public HouseCat(String aName) {
        name = aName;
    }

    /** Constructor exposing base class constructor using same syntax. Text says this is a bad constructor because it doesn't initialize "name". **/

    public HouseCat(double aWeight) {
        super(aWeight);
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    /** Overrides instance method in Cat. **/

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}