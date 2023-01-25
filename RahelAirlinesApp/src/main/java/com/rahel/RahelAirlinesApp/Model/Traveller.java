package com.rahel.RahelAirlinesApp.Model;

public class Traveller extends Person {
    private String creditCardInfo;
    private String ID;
    private  double Bags;
    public Traveller(String firstname, String lastname, String dateOfBirth, Adress adress) {
        super(firstname, lastname, dateOfBirth, adress);
    }

    public Traveller(String firstname, String lastname, String dateOfBirth, Adress adress, String creditCardInfo, String ID, double bags) {
        super(firstname, lastname, dateOfBirth, adress);
        this.creditCardInfo = creditCardInfo;
        this.ID = ID;
        Bags = bags;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public String ID() {
        return ID;
    }

    public void ID(String ID) {
        this.ID = ID;
    }

    public double getBags() {
        return Bags;
    }

    public void setBags(double bags) {
        Bags = bags;
    }
}
