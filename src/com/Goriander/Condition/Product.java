package com.Goriander.Condition;

public class Product {
    private String _name;
    private int _price, _quantity;
    Product(String name, int price, int quality)
    {
        this._name=name;
        this._price=price;
        this._quantity=quality;
    }
    int getQuality()
    {
        return _quantity;
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
        _quantity=quality;
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
