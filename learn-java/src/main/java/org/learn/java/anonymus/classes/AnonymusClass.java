/***
 * Anonymus class can be created by multiple ways. In this example crating anonymus class by interface
 *
 * Similarly it can be created by Abstract or core class too as shown in examples
 */
package org.learn.java.anonymus.classes;

 interface StartJob {
    public String startJob();
}

abstract  class  TestJobs{
     abstract void testAbstract();

     public void getStatus(){
         System.out.println("Runnng abstrac classes");
     }
}

public class AnonymusClass {

     public void testMethod(){
         System.out.println("test method");
     }

     public static void main(String[] args){

         /**
          * creating anonymus class from interface
          */
         StartJob  job = new StartJob() {
             @Override
             public String startJob() {
                 return  "job started";
             }
         };

         System.out.println(job.startJob());


         /**
          * Creating anonymus class from abstract classes
          */
         TestJobs testJobs = new TestJobs() {
             @Override
             void testAbstract() {
                 System.out.println("initalizing abstract jobs");
             }
         };

         testJobs.testAbstract();
         testJobs.getStatus();



     }
}