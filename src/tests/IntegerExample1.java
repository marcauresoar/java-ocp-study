package tests;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerExample1 {
    static Integer num1;
    static AtomicInteger num2;

    public static void main(String[] args){
        num1 = new Integer(5);
        num2 = new AtomicInteger(0);

        System.out.println(num1);
        System.out.println(num2);
    }
}
