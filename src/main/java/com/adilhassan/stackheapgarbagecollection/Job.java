package com.adilhassan.stackheapgarbagecollection;

public class Job implements Runnable {
    public int j;

    @Override
    public void run() {
        j = 10;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is running");
    }
}
