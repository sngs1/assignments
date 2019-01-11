package com.acad.assignments;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timer {

    private static class Updater implements Runnable {

        @Override
        public void run() {
            System.out.println("3 seconds passed");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Updater();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(r, 0, 3, TimeUnit.SECONDS);

        Thread.sleep(10000);
        service.shutdown();

    }
}