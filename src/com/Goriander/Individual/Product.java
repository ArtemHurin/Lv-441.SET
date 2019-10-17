package com.Goriander.Individual;

import java.time.LocalDate;
import java.time.Period;

public class Product implements consoleIO {
    //fields
    private String _brand;
    private String _model;
    private LocalDate _date;

    //set
    public void setBrand(String brand){ _brand = brand;}
    public void setModel(String model) { _model = model;}
    public void sedDate (String date) {_date = LocalDate.parse(date);}

    //get
    public String getBrand() {return _brand;}
    public String getModel() {return _model;}
    public String getDate() {return _date.toString();}

    //Constructor
    public Product(String brand, String model, String date) {
        _brand = brand;
        _model = model;
        _date = LocalDate.parse(date);
    }

    //Console IO
    public void input(){
        System.out.println("Write product brand: ");
        _brand=readString();

        System.out.println("Write product model: ");
        _model=readString();

        System.out.println("Write product date in format \"yyyy-mm-dd\"");
        _date=readDate();
    }

    public void output(){
        System.out.printf("Brand: %s, Model: %s, Date: %d:d:d \n",
                _brand,_model,_date.getYear(),_date.getMonth(),_date.getDayOfMonth());
    }

    @Override
    public String toString() {
        return "Product [" +
                "Brand: " + _brand + ',' +
                "Model: " + _model + ',' +
                "Date: " + _date.getYear() + ':'
                         + _date.getMonth() + ':'
                         + _date.getDayOfMonth() + ':' +
                ']';
    }

    //Methods
    public Period getAge(){
        return _date.until(_date);
    }
}
