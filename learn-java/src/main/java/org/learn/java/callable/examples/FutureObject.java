/**
 * 1) while for a Callable, the call() method needs to be implemented which returns a result on completion.
 * 2) Note that a thread can’t be created with a Callable, it can only be created with a Runnable.
 * 3) Another difference is that the call() method can throw an exception whereas run() cannot.
 * 4) Call() method inside callable returns output which can be stored in **future** object
 * 5) Callable is similar to Runnable, in that it encapsulates a task that is meant to run on another thread,
 *    whereas a Future is used to store a result obtained from a different thread.
 *
 * 6) To create the thread, a Runnable is required. To obtain the result, a Future is required.
 *
 * 7) The Java library has the concrete type FutureTask, which implements Runnable and Future,
 * combining both functionality conveniently.
 */

package org.learn.java.callable.examples;


import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableExample implements Callable {

    /**
     *
     * @return
     * @throws Exception
     *
     * Call() is basically task which is executed in new thread.
     */
    @Override
    public Object call() throws Exception {
        Thread.sleep( new Random().nextInt(8) * 1000);
       return new Random().nextInt(8);
    }
}


public class FutureObject {
    public static void main(String[] args){

        FutureTask[] futureTask = new FutureTask[5];
        for(int i = 0; i< 5; i++){
            futureTask[i] = new FutureTask(new CallableExample());
            Thread t = new Thread(futureTask[i]);
            t.start();
        }

        for(int i = 0; i< 5; i++){
            try{
                System.out.println("output for fututre task number i: " + i + " is: " + futureTask[i].get());
            }catch (Exception e){

            }

        }
    }
}