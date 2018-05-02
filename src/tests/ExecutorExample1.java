package tests;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class ExecutorExample1 {
    public static void useSupplier(Supplier<Integer> expression) { expression.get(); }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = null;
        try {

            service = Executors.newSingleThreadExecutor();

            service.submit(() -> System.out.println("execute this"));
            service.submit(() -> System.out.println("and this"));
            System.out.println("outside the service");
            Future<String> myValue = service.submit(() -> "this string");
            System.out.println(myValue.get());

            useSupplier(() -> { try { throw new IOException(); } catch (IOException e) {} return null; });

        } finally {
            System.out.println("finished");
            if(service != null) service.shutdown();
        }

    }
}
