package org.learn.java.threads.example;

public class ThreadByExtends extends Thread{
    ThreadByExtends(String tName){
        super(tName);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String [] args){
        Thread t1 = new ThreadByExtends("thread by extend");
        t1.start();
    }
    //By Extend
}
