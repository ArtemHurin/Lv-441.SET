package com.company.homework6.collection.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TenIntegers {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> myCollection = new ArrayList<Integer>();

    ArrayList<Integer> newCollection = new ArrayList<Integer>();


    public void fillUp() {
        while (myCollection.size() < 10) {
            System.out.println("Input 10 integers");
            try {
                for (int i = 0; i < 10; i++) {
                    myCollection.add(Integer.parseInt(br.readLine()));
                }
            } catch (IOException e) {
                System.out.println("Only integers");
            } catch (NumberFormatException e) {
                System.out.println("Only integers");
            }
        }
    }

    public void find() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));

            }
        }
        System.out.println("Add to new Collection");
        System.out.println(newCollection);
    }

    public void remove() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println("Method remove");
        System.out.println(myCollection);
    }

    public void insert() {
        while (myCollection.size() < 9) {
            try {
                if (myCollection.size() < 9) {
                    System.out.println("You need input more " + (9 - myCollection.size()) + " numbers");
                    for (int i = 0; i < 9 - myCollection.size(); i++) {
                        myCollection.add(Integer.parseInt(br.readLine()));
                        i--;
                    }
                }
            } catch (IOException e) {
                System.out.println("Only Integers");
            } catch (NumberFormatException e) {
                System.out.println("Only integers");
            }
        }

        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + (i + 1) + " value of element - " + myCollection.get(i));
        }
    }

    public void sort() {
        myCollection.sort(Integer::compareTo);
        System.out.println("Sorting");
        System.out.println(myCollection);
    }


}
