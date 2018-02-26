package chapter4.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p1.test("not empty"));





        // combining two predicates
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        //Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        //Predicate<String> otherEggs = s -> s.contains("egg") && ! s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        String testString = "brown eggs";
        System.out.println(brownEggs.test(testString)); // true
        System.out.println(otherEggs.test(testString)); // false
    }
}
