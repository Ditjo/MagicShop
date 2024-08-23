package com.example.magicshop;

public class Ware {

    private String Name;
    private double Price;
    private int Quantity;
    private String Description;

    public Ware() {
    }

    public Ware(String name, double price, int quantity, String description) {
        Name = name;
        Price = price;
        Quantity = quantity;
        Description = description;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
