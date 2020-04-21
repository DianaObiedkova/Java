package com.company;

import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    static int threads;
    static int iterations;
    static int counter = 0;
    public static void main (String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number of threads:");
        threads = scanner.nextInt();
        System.out.println("Enter a number of iterations:");
        iterations = scanner.nextInt();

        double startTime = System.currentTimeMillis();

        toParralel(threads);

        double pi = (4.0 * counter) / iterations;
        double endTime = System.currentTimeMillis();
        double time = (endTime - startTime);

        ShowResults(pi,time);
    }

    public static void toParralel(int threads){

        ExecutorService ex = Executors.newFixedThreadPool(threads);
        List<Future<Long>> list = new ArrayList<>();
        Callable<Long> caller = new Caller(iterations/threads);

        for (int i = 0; i < threads; i++) {
            Future<Long> future = ex.submit(caller);
            list.add(future);
        }

        for (var item : list) {
            try {
                counter += item.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ex.shutdown();
    }

    public static void ShowResults(double pi,double time){

        System.out.println("PI is " + pi);
        System.out.println("THREADS " + threads);
        System.out.println("ITERATIONS " + iterations);
        System.out.println("TIME " + time + " ms");
    }
}
