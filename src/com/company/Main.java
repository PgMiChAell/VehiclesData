package com.company;

private class Main {

    private static void main(String[] args) {
	// write your code here
        System.out.println("I hope you like cars");
        BestNCS Car1 = new BestNCS();
                Car1.Country = 1;
                Car1.YearsSold = "1960-2016";
                Car1.Amountsold = 3578689;
                Car1.automobileName = " Ford Falcon ";
                // michael is  here

                Car1.describe();

        System.out.println("Welcome to the Best Car Brand Sellers");

        Carbrandbestsellers Carbrandbestsellers1 = new Carbrandbestsellers();
        Carbrandbestsellers1.Brand = "alfa romeo";
        Carbrandbestsellers1.automobileName = "Alfa Romeo Alfasud";
        Carbrandbestsellers1.Amountsold = 1017387;
        Carbrandbestsellers1.YearsSold = "1972–1989";
        Carbrandbestsellers1.describes();
    }
}
