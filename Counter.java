package com.company;

import java.util.Scanner;

public class Counter implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                counter++;
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter(){
        Thread t2 = new Thread(this::run);
        t2.start();
        try {
            var scanner = new Scanner(System.in);
            System.out.print("Enter a number");
            int value = scanner.nextInt();
            System.out.println("Main thread");
            t2.interrupt();
            t2.join();
            System.out.println("Thread joins main thread and terminates at " +getCounter());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
