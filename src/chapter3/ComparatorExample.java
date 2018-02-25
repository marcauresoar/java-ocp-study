package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){
        Comparator<Duck> comp = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        Duck d1 = new Duck("Quack", 7);
        Duck d2 = new Duck("Another", 10);

        List<Duck> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);

        Collections.sort(list, comp);
        System.out.println(list); // [Quack, Another]
    }

    static class Duck {
        public String name;
        public int weight;

        public Duck(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
        @Override
        public String toString(){
            return this.name;
        }
    }
}


