package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Task;

public class ProductName {

	public static void main(String[] args) {

		Product product1 = new Product("Apple", 25.40, 20);
		Product product2 = new Product("Banana", 30.50, 15);
		Product product3 = new Product("Pineapple", 120.00, 5);
		Product product4 = new Product("Grapes", 52.80, 8);

		if (product1.getPrice() > product2.getPrice() && product1.getPrice() > product3.getPrice()
				&& product1.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is: " + product1.getName() + " with "
					+ product1.getQuantity() + " quantity.");
		}

		if (product2.getPrice() > product1.getPrice() && product2.getPrice() > product3.getPrice()
				&& product2.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is: " + product2.getName() + " with "
					+ product2.getQuantity() + " quantity.");
		}

		if (product3.getPrice() > product1.getPrice() && product3.getPrice() > product2.getPrice()
				&& product3.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is: " + product3.getName() + " with "
					+ product3.getQuantity() + " quantity.");
		}

		if (product4.getPrice() > product1.getPrice() && product4.getPrice() > product2.getPrice()
				&& product4.getPrice() > product3.getPrice()) {
			System.out.println("The most expensive product is: " + product4.getName() + " with "
					+ product4.getQuantity() + " quantity.");
		}

		if (product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity()
				&& product1.getQuantity() > product4.getQuantity()) {
			System.out.println("The product with the bigest quantity is " + product1.getName() + ".");
		}

		if (product2.getQuantity() > product1.getQuantity() && product2.getQuantity() > product3.getQuantity()
				&& product2.getQuantity() > product4.getQuantity()) {
			System.out.println("The product with the bigest quantity is " + product2.getName() + ".");
		}

		if (product3.getQuantity() > product1.getQuantity() && product3.getQuantity() > product2.getQuantity()
				&& product3.getQuantity() > product4.getQuantity()) {
			System.out.println("The product with the bigest quantity is " + product3.getName() + ".");
		}

		if (product4.getQuantity() > product1.getQuantity() && product4.getQuantity() > product2.getQuantity()
				&& product4.getQuantity() > product3.getQuantity()) {
			System.out.println("The product with the bigest quantity is " + product4.getName() + ".");
		}

	}

}
