package Java_Basics.Threads.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> a = List.of(1, 5, 6, 3, 2, 4, 7, 8, 9, 10);

        ExecutorService es = Executors.newFixedThreadPool(10);
        Sorter s = new Sorter(a, es);

        Future<List<Integer>> ans = es.submit(s);
        List<Integer> finalANs = ans.get();

        for (Integer finalAN : finalANs) {
            System.out.println(finalAN);
        }


    }
}