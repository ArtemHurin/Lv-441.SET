package com.academy.max.N2_Conditions.hw2_2;

public enum Days {
    FirstDay("Monday", "Понеділок", "Понедельник"),
    SecondDay("Tuesday", "Вівторок", "Вторник"),
    ThirdDay("Wednesday", "Середа", "Среда"),
    FourthDay("Thursday", "Четвер", "Четверг"),
    FifthDay("Friday", "П'ятниця", "Пятница"),
    SixDay("Saturday", "Субота", "Суббота"),
    SeventhDay("Sunday", "Неділя", "Воскресенье");

    private final String uaName;
    private final String enName;
    private final String ruName;
    private String allLanguagesNames;


    Days(String ua, String en, String ru) {
        this.uaName = ua;
        this.enName = en;
        this.ruName = ru;
        this.allLanguagesNames = ua + " " + en + " " + ru;
    }

    public String getUaName() {
        return uaName;
    }

    public String getEnName() {
        return enName;
    }

    public String getRuName() {
        return ruName;
    }

    public String getAllNames() {
        return allLanguagesNames;
    }
}
