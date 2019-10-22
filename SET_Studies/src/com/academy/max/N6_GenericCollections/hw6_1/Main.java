//Declare collection myCollection of 10 integers and fill it (from the console or random).
//        Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
//        Remove from collection myCollection elements, which are greater then 20. Print result
//        Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
//        Sort and print collection

package com.academy.max.N6_GenericCollections.hw6_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        final int SIZE_OF_COLLECTION = 10;
        Random random = new Random();

        List<Integer> myCollection = new ArrayList<Integer>(SIZE_OF_COLLECTION);
        List<Integer> newCollection = new ArrayList<Integer>();

        /* Create random collection from ints 0-10 */

        for (int i = 0; i < SIZE_OF_COLLECTION; i++) {
            Integer randomElement = random.nextInt(30);
            myCollection.add(randomElement);
        }

        /* Print generated collection */

        System.out.println("My collection");
        PrintCollection(myCollection);

        /*  Create newCollection. newCollection consists of indexes of myCollection  */

        for (int i = 0; i < myCollection.size(); i++) {
            Integer element = myCollection.get(i);
            if (element > 5) {
                newCollection.add(i); // newCollection consists of indexes of myCollection
            }
        }

// 1

        /*  Print newCollection  */

        System.out.println("Indexes of myCollection elements, which are greater then 5");
        PrintCollection(newCollection);

        /*  Removing from collection myCollection elements, which are greater then 20  */

        Iterator iterator2 = myCollection.iterator();
        while (iterator2.hasNext()) {
            if ((Integer) iterator2.next() > 20) {
                iterator2.remove();
            }
        }

        /*  Print myCollection  */

        System.out.println("My collection with dropped elements > 20");
        PrintCollection(myCollection);


        System.out.printf("Inserting element %d at position %d \n", 1, 2);
        System.out.printf("Inserting element %d at position %d \n \n", -4, 5);
        myCollection.set(2 - 1, 1);
        myCollection.set(5 - 1, -4);

        /*  Print myCollection  */

        System.out.println("Collection with changed elements");
        PrintCollection(myCollection);

        /*  Print myCollection in a different way */

        System.out.println("Detailed output of Collection");

        for (int i = 0; i < myCollection.size(); i++) {
            Integer currentElement = myCollection.get(i);
            System.out.printf("Position – %d, \t value of element – \t %d", i + 1, currentElement);
            System.out.println();
        }
        System.out.println();


        /*  Print unsorted/sorted myCollection  */

        System.out.println("Unsorted Collection");
        PrintCollection(myCollection);

        Collections.sort(myCollection);
        System.out.println("Sorted Collection");
        PrintCollection(myCollection);

        System.out.println(myCollection.toString());
    }


// 2

private static void PrintCollection(List<Integer> collection) {
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
        Integer currentElement = (Integer) iterator.next();
        System.out.printf(currentElement + "\t");
    }
    System.out.println();
    System.out.println();
}
}




//1

// Doesn't work good
//        Iterator <Integer> iterator1 = myCollection.iterator();
//        while (iterator1.hasNext()) {
//            Integer element = (Integer) iterator1.next();
//            if (element > 5) {
//                Integer indexOfAllowedElements = myCollection.indexOf(element);
//                newCollection.add(indexOfAllowedElements);
//            }
//        }



//2

// Doesn't work good
//        Iterator iterator3_1 = generatedCollection.iterator();
//        Iterator iterator3_2 = generatedCollection.iterator();
//        while (iterator3_1.hasNext()) {
//            int iteratorPosition = generatedCollection.indexOf(iterator3_1.next());
//            Integer currentElement = (Integer) iterator3_2.next();
//            System.out.printf("Position – %d, value of element – %d", iteratorPosition, currentElement);
//            System.out.println();
//        }
//    }
//