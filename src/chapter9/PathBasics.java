package chapter9;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathBasics {
    public static void main(String[] args) throws URISyntaxException {
        Path p1 = Paths.get("/my/custom/path.txt");
        Path p2 = FileSystems.getDefault().getPath("/my/other/path.txt");

        Path p3 = Paths.get(new URI("file:///my/file/path"));
        // Path p4 = Paths.get(new URI("file://my/file/path")); // throws exception


        File f1 = new File("/path/to/file.txt");
        Path p5 = f1.toPath();

        Path p6 = Paths.get("/other/path.txt");
        File f2 = p6.toFile();
    }
}
