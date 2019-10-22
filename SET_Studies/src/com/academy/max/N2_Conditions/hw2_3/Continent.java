package com.academy.max.N2_Conditions.hw2_3;

public enum Continent {
    NorthAmerica ("North America"),
    SouthAmerica ("South America"),
    Europe ("Europa"),
    Asia ("Asia"),
    Africa("Africa"),
    Antarctica("Antarctica"),
    Oceania("Oceania");

    private final String name;

    Continent(String continentName){
        this.name = continentName;
    }

    @Override
    public String toString() {
        return name;
    }
}

