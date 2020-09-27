package com.cib.defender.web;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName:test
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/26 3:52 PM
 * @Version:1.0
 **/
public class Counter {
    private static long counter = 0;
//    private static AtomicLong counter = new AtomicLong(0);
    public synchronized static long addOne(){
        return ++counter;
//        return counter.incrementAndGet();
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        if(Counter.addOne() == 100){
                            System.out.println("counter = 100");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
    }
}