package chapter4.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);


        c1.accept("this is a string");
        c2.accept("another one");

    }
}
