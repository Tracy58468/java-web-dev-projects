package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu menu = new Menu();

        MenuItem menuItem1 = new MenuItem(new Date(), "Breakfast burrito", "Breakfast");

        MenuItem menuItem2 = new MenuItem(new Date(), "Bean burrito", "Entree", "Flour tortilla filled with refried beans and cheese", 5.00);

        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);

        System.out.println();
    }
}
