package org.launchcode;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<> {};

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);

        // update isNew on old items (x days before new item add date) when item is added - use Date class menuItem.isNew = false;
    }
}
