package chapter3;

import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();

        // add()
        l1.add("AB"); // [AB]
        l1.add("CD"); // [AB, CD]

        // remove()
        l1.remove("CD"); // [AB]

        // isEmpty()
        System.out.println(l1.isEmpty()); // false

        // size()
        System.out.println(l1.size()); // 1

        // clear()
        l1.clear(); // []

        // contains()
        System.out.println(l1.contains("CD")); // false


        List<String> l2 = new ArrayList<>();
        l2.add("first");
        l2.add("second");
        // set
        l2.set(0, "another first");
        // get
        System.out.println(l2.get(1));
        // indexOf
        System.out.println(l2.indexOf("second"));

        List<String> l3 = new LinkedList<>();
        //Queue<String> l3 = new LinkedList<>();
        l3.add("linked first");
        l3.add("linked second");

        Stack st1 = new Stack();
        st1.add("stack first");
        System.out.println(st1);
        st1.remove(0);
        System.out.println(st1);


    }
}
