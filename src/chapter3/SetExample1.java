package chapter3;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {

        Set<String> st1 = new HashSet<>();
        st1.add("elephant");
        st1.add("elephant"); // returns false
        System.out.println(st1);

        System.out.println(st1.contains("elephant")); // true

        //Set<String> st2 = new TreeSet<>();
        NavigableSet<String> st2 = new TreeSet<>();
        st2.add("no");
        st2.add("yes");
        st2.add("maybe");

        System.out.println(st2.ceiling("o")); // yes



    }
}
