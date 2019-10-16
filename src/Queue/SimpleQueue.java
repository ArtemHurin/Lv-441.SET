package Queue;

import java.util.*;

public class SimpleQueue {

    public void Simple()
    {
        //Define
        Queue<String> queue = new LinkedList<String>();
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();

        ArrayDeque<String> dqueue = new ArrayDeque<String>();

        //1
        queue.add("1");
        queue.add("3");
        queue.add("5");
        queue.add("4");
        queue.add("2");


        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
        System.out.println("-------------------");

        //2
        pqueue.add(1);
        pqueue.add(3);
        pqueue.add(5);
        pqueue.add(4);
        pqueue.add(2);

        while(!pqueue.isEmpty())
        {
            System.out.println(pqueue.poll());
        }
        System.out.println("-------------------");

        //3
        dqueue.add("1");
        dqueue.addFirst("2");
        dqueue.addLast("3");
        dqueue.add("4");

        while(!dqueue.isEmpty())
        {
            System.out.println(dqueue.poll());
        }
        System.out.println("-------------------");
    }

}
