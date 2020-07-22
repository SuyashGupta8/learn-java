//::::Notes:::::
//:::Refer to 

package org.learn.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnThreadPoolExecutor {

    private String str = "";
    public synchronized void buildString(String str){
        this.str = this.str.concat(" ").concat(str);
        System.out.println(this.str);
    }

    public static void main(String []args){
        final LearnThreadPoolExecutor lte = new LearnThreadPoolExecutor();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                lte.buildString("I am");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                lte.buildString("excited to");
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                lte.buildString("write thread pool executor");
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(r1);
        executor.execute(r2);
        executor.execute(r3);

        executor.shutdown();
        while(!executor.isTerminated()){
            //System.out.println("waiting for executor to shut down");
        }

        System.out.println("all thread execution finished");
    }
}
