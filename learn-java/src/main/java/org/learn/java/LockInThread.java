//:::Notes:::
//This class will print odd by another thread and even by another thread
//But output will be 0,1,2,3,4,5,6,7,8

package org.learn.java;

public class LockInThread {

    private int i = 0;


    public  void  printEven(){
        synchronized (this){
            while (i < 10){
                if(i%2 == 0){
                    System.out.println("Number is: "+ i);
                    i++;
                }else{
                    try{
                        this.notifyAll();
                        this.wait();


                    }catch (InterruptedException e){
                        System.out.println("Interrupted exception "+ e.getCause().toString());
                    }
                }
            }
        }

    }

    public  void  printOdd(){
        synchronized (this){
            while (i < 10){
                if(i%2 == 1){
                    System.out.println("Number is: "+ i);
                    i++;
                }else{
                    this.notifyAll();
                    try{
                        this.wait();

                    }catch (InterruptedException e){
                        System.out.println("Interrupted exception "+ e.getCause().toString());
                    }
                }
            }
        }

    }

    public static void main(String[] args){

        final LockInThread lit = new LockInThread();
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
