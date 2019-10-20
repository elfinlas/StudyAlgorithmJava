package com.elfinlas.etc;

/**
 * Created by MHLab on 2019/10/17..
 */

public class ThreadExam {

    static class ThreadWithRunnable implements Runnable {

        @Override
        public void run() {
            for (int i=0; i<5; i++) {
                System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void runThread() {
        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10);

        thread1.start(); // Thread-0 실행
        thread2.start(); // Thread-1 실행

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
    }
}
