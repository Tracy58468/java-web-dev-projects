package org.launchcode;

import java.util.Date;

public class MenuItem {

    private Date dateAdded;
    private String name;
    private String category;
    private String description;
    private double price;
    private Boolean isNew = true;

    public MenuItem(Date dateAdded, String name, String category, String description, double price, Boolean isNew) {
        this.dateAdded = dateAdded;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public MenuItem(Date dateAdded, String name, String category) {
        this(dateAdded, name, category, null, null, true);
    }
}
