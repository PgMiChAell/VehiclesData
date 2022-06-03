package com.company;

public class Carbrandbestsellers extends AnyCar {
   private String Brand;

   //Constructer


    public Carbrandbestsellers(String automobileName, long amountsold, String yearsSold, String brand) {
        super(automobileName, amountsold, yearsSold);
        Brand = brand;
    }

    // Getter and setters
    public String getBrand() {
        return Brand;
    }

    protected void setBrand(String brand) {
        Brand = brand;
    }

    public String toString(){
        return "The Car Brand sells " + getAutomobileName() + ", sold "+ getAmountsold() + " from " + getYearsSold();
    }
}
