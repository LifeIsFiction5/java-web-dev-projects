package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private final LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String category, String dateAdded) {
        this.itemName = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.parse(dateAdded);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysOnMenu = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysOnMenu < 30;
    }

    @Override
    public String toString() {
        String checkNew = isNew() ? "*** NEW ITEM ***" : "";
        return itemName + checkNew + "\n" + description + " | $" + price;
    }
}

