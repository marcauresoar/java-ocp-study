package chapter8;

import java.io.*;

public class CopyBufferFileSample {
    public static void main(String[] args) throws IOException {
        File source = new File("myfile.txt");
        File destination = new File("./myfile-out.txt");

        copy(source, destination);
    }

    public static void copy(File source, File destination) throws IOException {
        try(InputStream in = new BufferedInputStream(new FileInputStream(source));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[5];
            int lengthRead;
            while((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}
