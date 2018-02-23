package chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("koala", "bamboo");
        map1.put("lion", "meat");
        map1.put("giraffe", "leaf");
        String food1 = map1.get("koala"); // bamboo
        for (String key: map1.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,


        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        String food2 = map2.get("koala"); // bamboo
        for (String key: map2.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,

        // System.out.println(map2.contains("lion")); // DOES NOT COMPILE
        System.out.println(map2.containsKey("lion")); // true
        System.out.println(map2.containsValue("lion")); // false
        System.out.println(map2.size()); // 3
    }
}
