package tests;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.function.BiFunction;

public class CompareInteger {
    public static void main(String[] args){

        BiFunction<Integer, Integer, Integer> func = (i1, i2) -> Integer.compare(i1, i2);

        System.out.println(func.apply(5, 2));

    }
}
