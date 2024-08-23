package com.example.magicshop;

import java.util.ArrayList;
import java.util.List;

public class Data {

    static List<Ware> ShoppingCart = new ArrayList<>();

    static List<Ware> AddData(){
        List<Ware> inventory = new ArrayList<>();

        inventory.add(new Ware("Spiderlegs", 6, 64,"Legs of the Spiders from the forest"));
        inventory.add(new Ware("Wind of Howling Peaks", 70, 3,"Winds collected from the Howling Peaks"));
        inventory.add(new Ware("Tears of Unicorn", 270, 1,"Tears collected from a unicorn crying of sorrow"));
        inventory.add(new Ware("Batwings", 18, 120,"Ethically sourced Batwings, after they have dropped"));

        return inventory;
    }
}
