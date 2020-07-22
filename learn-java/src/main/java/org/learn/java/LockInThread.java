//:::Notes:::
//1) This class will have two seprate threads
//2) One thread will print only odd numbers
//3) Second thread will print even numbers
//4) But output should be 0,1,2,3,4,5,6,7,8
//5) Notify, NotifyAll will notify other thread waiting for same object to get the lock
//6) Wait will put thread in wait state

//:::Lock Concept Notes:::::
//5) Each object has lock inherited from Object class
//6) With synchronise thread aquire lock of that object
//7) There will be no common lock(object level lock) between two different object of same class
//8) class level lock will be same for all objects

package org.learn.java;

public class LockInThread {

    private int i = 0;
    private int max;

    LockInThread(int max){
        this.max = max;
    }

    public  void  printEven(){
        synchronized (this){
            while (i < max){
                if(i%2 == 0){
                    System.out.println("Number is: "+ i);
                    i++;
                }else{
                    try{
                        this.notifyAll();
                        this.wait();
                    }catch (Exception e){
                        System.out.println("Interrupted exception "+ e.getCause().toString());
                    }
                }
            }
        }

    }

    public  void  printOdd(){
        synchronized (this){
            while (i < max){
                if(i%2 == 1){
                    System.out.println("Number is: "+ i);
                    i++;
                }else{
                    try{
                        this.notifyAll();
                        this.wait();
                    }catch (Exception e){
                        System.out.println("Interrupted exception "+ e.getCause().toString());
                    }
                }
            }
            this.notifyAll();
        }

    }

    public static void main(String[] args){

        final LockInThread lit = new LockInThread(100);
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                lit.printEven();
            }
        });
        even.start();

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                lit.printOdd();
            }
        });

        odd.start();
    }

}
