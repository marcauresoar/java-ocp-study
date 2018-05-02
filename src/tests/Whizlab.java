package tests;

import java.util.Map;
import java.util.TreeMap;

public class Whizlab {

    public static void main(String args[]){
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.replace(1, "One", null);
        map.replaceAll((i, s) -> i + " - " + s);
        map.keySet().stream().mapToDouble(i -> i).forEach(System.out::println);

        System.out.println(map);
    }
}
