package org.learn.java.threads.example;

/**
 * Hello world!
 *
 */
public class ThreadByImplements implements  Runnable
{
    @Override
    public void run(){
       System.out.println(Thread.currentThread().getName());
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Thread t1 = new Thread(new ThreadByImplements(), "thread1");
        t1.start();

        Thread t2 = new Thread(new ThreadByImplements(), "thread2");
        t2.start();

        //By Creating Anonymus class

        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }, "thread3 by anonymus class");
        t3.start();


    }
}
