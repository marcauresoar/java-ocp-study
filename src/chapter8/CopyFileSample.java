package chapter8;

import java.io.*;

public class CopyFileSample {
    public static void main(String[] args) throws IOException {
        File source = new File("myfile.txt");
        File destination = new File("./myfile-out.txt");

        copy(source, destination);
    }

    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination)) {
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
}

