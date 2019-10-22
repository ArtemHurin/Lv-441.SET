//        Create class Product with fields name, price and quantity.
//        Create four instances of type Product.
//        Display the name and quantity of the most expensive item.
//        Display the name of the items, which has the biggest quantity.

package com.academy.max.N2_Conditions.hw2_4;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Bread", 20.3, 10);
        Product product2 = new Product("Milk", 10.1);
        Product product3 = new Product("Butter", 40.5, 5);
        Product product4 = new Product("Pineapple", 50.2, 3);

        Product arrayOfProducts[] =  {product1, product2, product3, product4};

        for (int i=0; i<4; i++) {
            System.out.println(arrayOfProducts[i]);
        }

        Product itemWithbiggestQuantity = product1;
        Product itemWithbiggestPrice = product1;

        // determining item with biggest quantity
        for (int i=1; i<=3; i++) {
           if (arrayOfProducts[i].getQuantity() > itemWithbiggestQuantity.getQuantity()){
               itemWithbiggestQuantity = arrayOfProducts[i];
           }
        }
        System.out.println();
        System.out.println("Item with biggest quantity: " + itemWithbiggestQuantity.getName());

        // determining item with biggest price
        for (int i=1; i<4; i++) {
            if (arrayOfProducts[i].getPrice() > itemWithbiggestPrice.getPrice()){
                itemWithbiggestPrice = arrayOfProducts[i];
            }
        }
        System.out.println("Item with biggest price: " + itemWithbiggestPrice.getName() + ". Price: " + itemWithbiggestPrice.getPrice());

    }
}




