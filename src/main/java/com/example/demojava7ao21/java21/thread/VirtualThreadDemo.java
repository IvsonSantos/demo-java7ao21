package com.example.demojava7ao21.java21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

public class VirtualThreadDemo {

    public static void main(String[] args) {
        final int NTASKS = 100;
        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
        for (int i = 0; i < NTASKS; i++) {
            service.submit(() -> {
                long id = Thread.currentThread().threadId();
                // the code uses LockSupport.parkNanos instead of Thread.sleep so that we don't have to catch the pesky InterruptedException.
                LockSupport.parkNanos(1_000_000_000);
                System.out.println(id);
            });
        }
        service.close();
    }

}
