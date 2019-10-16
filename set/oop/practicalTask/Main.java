package set.oop.set.oop.practicalTask;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers, please");
        for (int i = 0; i < 10; i++) {
            int fillIn = Integer.parseInt(br.readLine());
            if (fillIn > 5) {
                myCollection.add(fillIn);

            }
        }
        System.out.println(myCollection);
        for (int i =0; i<myCollection.size();i++) {
            if(myCollection.get(i)>20){
                myCollection.remove(i);
            }
        }
        System.out.println(myCollection);
        myCollection.set(1,1);
        myCollection.set(7,8);
        myCollection.set(4,-4);
        System.out.println("position 2 " + myCollection.get(1));
        System.out.println("position 8 " + myCollection.get(7));
        System.out.println("position 5 " + myCollection.get(4));
        System.out.println(myCollection);
        myCollection.sort(Integer::compareTo);
        System.out.println(myCollection);

    }
    }
