package chapter1.nestedclasses.staticnestedclass;

import static chapter1.nestedclasses.staticnestedclass.Enclosing.Nested;

public class StaticExample {
    public static void main(String[] args){
        Nested n = new Enclosing.Nested();
        n.print();
    }
}
