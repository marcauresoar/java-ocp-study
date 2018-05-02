package chapter6.exceptions;

public class TryWithResourcesExample1 {

    public static void main(String[] args){
        try (
                MyCustomReader r1 = new MyCustomReader(1);
                MyCustomReader r2 = new MyCustomReader(2)
        ) {
            System.out.println("doing something");
            throw new RuntimeException("exception inside try block");
        } catch (IllegalStateException e) {
            System.out.println("catched illegal state");
        } catch (RuntimeException e) {
            System.out.println("catched runtime");
        } finally {
            System.out.println("finally ends");
        }
    }

}

class MyCustomReader implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        System.out.println("closing reader " + number);
        throw new IllegalStateException("exception during closure");
    }
    MyCustomReader(int number) {
        this.number = number;
    }
    private int number;
}
