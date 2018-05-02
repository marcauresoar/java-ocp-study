package tests;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Concurrent {
    public static void main(String... args){

        // First group
        CompletableFuture<String> task11 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(4000);
                return "first";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        CompletableFuture<String> task12 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
                return "second";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        CompletableFuture<String> task13 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                return "third";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });

        // this one will complete after all tasks from the first group complete
        CompletableFuture<Void> allFirstTasks = CompletableFuture.allOf(task11, task12, task13);

        List<CompletableFuture<String>> multi = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            final int x = i;
            multi.add(CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(100);
                    return "from multi " + x;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }));
        }

        CompletableFuture<Void> allSecondTasks = CompletableFuture.allOf(multi.toArray(new CompletableFuture[multi.size()]));

        // Second group will be child tasks from the first group
        CompletableFuture<List<String>> result = allFirstTasks.thenApply(r -> {
            List<String> list = new ArrayList<>();
            list.add(task11.join());
            list.add(task12.join());
            list.add(task13.join());

            CompletableFuture<List<String>> secondList = allSecondTasks.thenApply(s -> multi.stream().map(x -> x.join()).collect(Collectors.toList()));

            List<String> nova = secondList.join();
            for(String res : nova){
                list.add(res);
            }
            return list;
        });

        System.out.println(Arrays.toString(result.join().toArray()));

    }
}
