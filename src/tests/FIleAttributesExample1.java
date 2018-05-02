package tests;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class FIleAttributesExample1 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/maurelio/Downloads/notes.txt");

        Map mp = Files.readAttributes(path, "*");
        System.out.println(mp); // {lastAccessTime=2018-03-05T10:54:28Z, lastModifiedTime=2018-03-02T20:27:29Z, size=3354, creationTime=2018-02-22T13:19:15Z, isSymbolicLink=false, isRegularFile=true, fileKey=(dev=1000004,ino=8592254477), isOther=false, isDirectory=false}

        BasicFileAttributes at = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(at.creationTime()); // 2018-02-22T13:19:15Z

        System.out.println(Files.getOwner(path)); // maurelio

    }
}
