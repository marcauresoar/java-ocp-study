package tests;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class DownloadImageExample {
    public static void main(String[] args){

        ExecutorService service = Executors.newFixedThreadPool(30);

        List<CompletableFuture<Void>> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(CompletableFuture.runAsync(() -> download(), service));
        }

        list.stream().map(x -> x.join()).collect(Collectors.toList());

    }

    public static void download(){
        Image image = null;
        try {
            URL url = new URL("http://fcab-stage-fiat.adobecqms.net/content/dam/fiat/products/226/customcar/0007-png/0007-809.png");
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();
            System.out.println("Found!");
        } catch (IOException e) {
            System.out.println("not found!");
        }
    }
}
