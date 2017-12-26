package chapter1.nestedclasses.localinnerclass;

public class Outer {
    private int length = 5;
    public void calculate(){
        final int width = 20;
        int height;
        height = 10;
        class Inner {
            public void multiply(){
                System.out.println(length * width * height);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.calculate();
    }
    public void isItFinal() {
        int one = 20; // one = effectively final

        int two = one;
        two++; // two = not effectively final

        int three; // three = effectively final
        if ( one == 4) three = 3;
        else three = 4;

        int four = 4; // four = not effectively final
        class Inner { }
        four = 5;
    }
}
