package com.company;

public class BestNCS extends AnyCar {
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
    void describe(){
        System.out.println("The Car sales for the" + getAutomobileName() + ", numbers " + getAmountsold() + " and the Years Sold were from " + getYearsSold() );
    }

}
