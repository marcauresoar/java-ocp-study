package chapter4.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("start", "st"));
    }
}
