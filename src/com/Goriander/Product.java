package com.Goriander;

public class Product {
    private String _name;
    private int _price, _quality;
    Product(String name, int price, int quality)
    {
        this._name=name;
        this._price=price;
        this._quality=quality;
    }
    int getQuality()
    {
        return _quality;
    }
    int getPrice()
    {
        return _price;
    }
    String getName()
    {
        return _name;
    }
    void setQuality(int quality)
    {
        _quality=quality;
    }
    void setPrice(int price)
    {
        _price=price;
    }
    void setName(String name)
    {
        _name=name;
    }

}
