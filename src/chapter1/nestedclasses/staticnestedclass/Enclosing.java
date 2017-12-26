package chapter1.nestedclasses.staticnestedclass;

public class Enclosing {
    static class Nested {
        private int price = 6;
        public void print(){
            System.out.println("this is nested!");
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
