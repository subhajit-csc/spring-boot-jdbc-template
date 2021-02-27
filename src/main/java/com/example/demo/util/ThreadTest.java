package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service with a thread pool of Size 2");
        ExecutorService executorService = null; //Executors.newFixedThreadPool(2);

        List<ExecutorService> list=new ArrayList<>();
        for (int i=0;i<100;i++){
            executorService = Executors.newFixedThreadPool(10000);

            Runnable task1 =null;
            for (int j=0;j<10000;j++){
                task1 = () -> {
                    System.out.println("Executing Task inside : " + Thread.currentThread().getName());
                    try {
                        TimeUnit.SECONDS.sleep(0);
                    } catch (InterruptedException ex) {
                        throw new IllegalStateException(ex);
                    }
                };
                executorService.submit(task1);
            }
            list.add(executorService);
        }



        System.out.println("Submitting the tasks for execution...");
        for (ExecutorService service:list) {
            service.shutdown();
        }
        //executorService.shutdown();
    }
}
