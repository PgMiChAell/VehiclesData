package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BestNCS extends AnyCar {
    private static Throwable e;
    //fields
   private String Country;
  private   int Image;

    public BestNCS(String automobileName, long amountsold, String yearsSold, String country, int image) {
        super(automobileName, amountsold, yearsSold);
        Country = country;
        Image = image;
    }
    // Getters and Setting


    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    protected int getImage() {
        return Image;
    }

    protected void setImage(int image) {
        Image = image;
    }

    //methods
    public String toString(){
        return " The Car sales for the" + getAutomobileName() + ", numbers " + getAmountsold() + " and the Years Sold were from " + getYearsSold();
    }


    static public void readAllData() {
        try {
            File myObj = new File("Best National Car Sellers");
            Scanner fileReader = new Scanner(myObj);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Scanner lineReader = new Scanner(line);
                lineReader.useDelimiter("\t");
                String country = lineReader.next();
                lineReader.next();
                String automobileName = lineReader.next();
                System.out.println(automobileName);
                int amountsold = lineReader.nextInt();
                String yearsSold = lineReader.next();
                int image = lineReader.nextInt();
                Object something = new BestNCS(automobileName, amountsold, yearsSold, country, image);
                System.out.println(something);
                fileReader.close();
            }
            } catch(FileNotFoundException ex) {
                        System.out.println("An error occurred. ");
                ex.printStackTrace();
                }
            }


}
