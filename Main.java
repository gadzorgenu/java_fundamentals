package com.company;

import java.util.Random;

public class Main {
    static final int TASK_COUNT = 20;

    public static void main(String[] args) {


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int counter = 0;
//                while (!Thread.interrupted()){
//                   try {
//
//                       System.out.println(counter);
//                       counter++;
//                       Thread.sleep(1000);
//                   }catch (InterruptedException ie){
//                       Thread.currentThread().interrupt();
//                   }
//                }
//            }
//        });
//
//        t1.start();

//        var counter = new Counter();
//       counter.increaseCounter();
//        System.out.println(counter.getCounter());

        Random random = new Random();
        var view = new View();
        var engine = new Engine();

        View.println("Starting...");
        for (int i = 0; i <TASK_COUNT; i++){
            engine.dispatch(new Task(i, random.nextInt(Task.LIMIT), view), random.nextInt(Task.LIMIT));
        }
        engine.shutdown();
        view.displayResult();
        View.println("Done active threads = " + Thread.activeCount());

    }
}
