package chapter3;

import java.lang.Comparable;

public class ComparableExample {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.id = 1;
        Animal a2 = new Animal();
        a2.id = 2;
        System.out.println(a1.compareTo(a2)); // -1
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 1
    }
}

class Animal implements Comparable<Animal> {
    public int id;
    public int compareTo(Animal a) {
        return id - a.id;
    }
}