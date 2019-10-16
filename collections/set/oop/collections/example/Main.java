package set.oop.collections.set.oop.collections.example;

import java.util.*;

public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        //  Map<String, Integer> hm = new HashMap<String, Integer>();
        Map<String, Integer> hm = new LinkedHashMap<String, Integer>();

        hm.put("d", new Integer(100));
        hm.put("c", new Integer(200));
        hm.put("a", new Integer(300));
        hm.put("d", new Integer(400));
        System.out.println(hm);

        Set<Map.Entry<String, Integer>> st = hm.entrySet();

        for (Map.Entry<String, Integer> me : st) {

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
             if(me.getValue().equals(300))
                System.out.println(me.getKey());

//            System.out.println(hm.size());
//            System.out.println(hm.containsValue(300));
        }
    }
}

