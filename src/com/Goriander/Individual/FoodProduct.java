package com.Goriander.Individual;

import java.time.LocalDate;
import java.time.Period;

public class FoodProduct extends Product implements consoleIO {
    //fields
    private String foodType;
    private LocalDate suitDur; //SuitabilityDuration

    //set
    public void setFoodType(String foodType){this.foodType = foodType;}
    public void setSuitDur(String date){this.suitDur = LocalDate.parse(date, DTFORMAT);}

    //get
    public String getFoodType(){return foodType;}
    public LocalDate getSuitDur(){return suitDur;}

    //Constructors
    public FoodProduct(){
        super();
        foodType="none";
        suitDur= LocalDate.parse("00-00-2020",DTFORMAT);
    }

    public FoodProduct(String brand, String model, String date, String foodType, String suitDur) {
        super(brand, model, date);
        this.foodType=foodType;
        this.suitDur=LocalDate.parse(suitDur,DTFORMAT);
    }

    //Methods
    public Period getExpirationDate(){
        return suitDur.until(suitDur);
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Write food type:");
        foodType=consoleIO.readString();

        System.out.println("Write product date in format \"dd-mm-yyyy\"");
        suitDur=consoleIO.readDate();
    }

    @Override
    public void output() {
        super.output();
    }
}
