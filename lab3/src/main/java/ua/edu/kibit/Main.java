package ua.edu.kibit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        int size = 20_000_000;
        double[] array = new double[size];
        double step =20.0 / size;

        int threads = 5;

        for (int i = 0; i < size; i++) {
            array[i] = -10 + i * step;
        }

        long milli1 = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        Future[] futures = new Future[array.length];

        int chunk = size / threads;
        for (int i = 0; i < array.length; i = i + chunk) {
            int end = Math.min(array.length, i + chunk);
            executor.execute(new CalculatePlotTask(array, i, end, new MyTrigFunc()));
        }

        long milli2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (milli2 - milli1) + " ms");
        PlotDisplayer.showChart(array, step);
    }
}
