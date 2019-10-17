package com.Goriander.Individual;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Product implements consoleIO {
    //fields
    public static DateTimeFormatter DTFORMAT = DateTimeFormatter.ofPattern("dd-mm-yyyy");
    private String brand;
    private String model;
    private LocalDate date;

    //set
    public void setBrand(String brand){ this.brand = brand;}
    public void setModel(String model) { this.model = model;}
    public void sedDate (String date) {this.date = LocalDate.parse(date, DTFORMAT);}

    //get
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public LocalDate getDate() {return date;}

    //Constructor
    public Product(){
        brand="none";
        model="none";
        date=LocalDate.parse("00-00-2000", DTFORMAT);
    }

    public Product(String brand, String model, String date) {
        this.brand = brand;
        this.model = model;
        this.date = LocalDate.parse(date);
    }

    //Console IO for object
    public void input(){
        System.out.println("Write product brand: ");
        brand=consoleIO.readString();

        System.out.println("Write product model: ");
        model=consoleIO.readString();

        System.out.println("Write product date in format \"dd-mm-yyyy\"");
        date=consoleIO.readDate();
    }

    public void output(){
        System.out.printf("Brand: %s, Model: %s, Date: %d:d:d \n",
                brand,model,date.getYear(),date.getMonth(),date.getDayOfMonth());
    }

    @Override
    public String toString() {
        return String.format("Product [Brand: %s; Model: %s; Date: %d:%s:%d]",
                             brand,model,date.getYear(),date.getMonth(),date.getDayOfMonth());
    }

    //Methods
    public int getAge(){
        Period result = date.until(date);
        return result.getYears();
    }
}
