public class Main {

    public static void main(String[] args) {

        HouseCat friday = new HouseCat("Friday", 4.5);
        friday.eat();
        System.out.println(friday.isTired());

        HouseCat garfield = new HouseCat("Garfield");
        System.out.println(garfield.getWeight());

//        Cat regularCat = new Cat(8);
        HouseCat gary = new HouseCat("Gary", 10);

//        System.out.println(regularCat.noise());
        System.out.println(gary.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        System.out.println(((HouseCat) suki).isSatisfied()); // calls child method on cat created with Cat, instead of HouseCat.


    }

}
