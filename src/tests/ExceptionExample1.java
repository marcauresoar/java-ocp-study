package tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String... args){

        /*try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter x value: ");
            int x = in.nextInt();
            System.out.println("Enter y value: ");
            int y = in.nextInt();

            System.out.println(x + y);
        }*/

        byte[] b = new byte[10];
        InputStream in = System.in;

        try {
            int i = in.read(b);

            for(byte c : b) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            System.out.println("There was an error reading values.");
        }

    }
}
