/**
 * Lambda expressions basically express instances of functional
 * interfaces (An interface with single abstract method is called functional interface. An example is java.lang.Runnable)
 *
 *Note** Lambda expression in right hand side is nothing but function like (arg1, arg2) -> { s.o.p(function body)}
 *
 * The above function body when assigned to instance of interface it becomes instance
 */

package org.learn.java.anonymus.classes;

interface LambdaInstance{
    void abstractFunction(String name, String lname);
}
public class LambdaExpression {

    public static void main (String[] args){
        LambdaInstance LI = (String name, String lnaame) -> {
            System.out.println("My name is: "+ name + " "+ lnaame);
            System.out.println("Lambda Instance tested");
        };
        LI.abstractFunction("suyash", "gupta");
    }

}
