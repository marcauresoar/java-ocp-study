package chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String... args){
        ArrayDeque<String> qu1 = new ArrayDeque<>();
        // add
        qu1.add("new element");
        // offer
        qu1.offer("offered");
        // push
        qu1.push("another");

        System.out.println(qu1); // [new element, offered, another]
        // peek
        System.out.println(qu1.element()); // new element
        System.out.println(qu1.peek()); // new element
        System.out.println(qu1); // [new element, offered, another]
        // poll
        System.out.println(qu1.poll()); // new element
        System.out.println(qu1); // [offered, another]
    }
}
