package com.company;

public class AnyCar {

    // # OF USAGES
    // # of usages
    private String automobileName;
    //# of usages
    private long Amountsold;
    private  String YearsSold;

    //constructer


    public AnyCar(String automobileName, long amountsold, String yearsSold) {
        this.automobileName = automobileName;
        this.Amountsold = amountsold;
        this.YearsSold = yearsSold;
    }

    public String getYearsSold() {
        return YearsSold;
    }

    public void setYearsSold(String yearsSold) {
        YearsSold = yearsSold;
    }

    public long getAmountsold() {
        return Amountsold;
    }

    public void setAmountsold(long amountsold) {
        Amountsold = amountsold;
    }
// Getters and Setters

    public String getAutomobileName() {
        return automobileName;
    }

    public void setAutomobileName(String automobileName) {
        this.automobileName = automobileName;
    }
}
