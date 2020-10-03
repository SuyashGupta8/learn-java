/**
 * Inheritance Notes::
 *
 * 1) Private method cannot be accesed outside class, even by inheritance or ppymorphism, we cannot override private method
 * 2) Protected method can be accessed only when we extends the class
 * 3) If we override  or extend method in child class and create object of child class it will call overidden merthod
 *  otherwise it will call parent method
 *
 *  4) overloading will not wor by changing only return types.
 *  There cannot be two method having same return type and parameters
 *
 *  5) scope  can be increased on child class cannot be decreased
 *  Consider a class B which inherits from A. A.m() is public. Now consider this code:
 *
 * A obj = new B(); obj.m();
 * Should this call be allowed? Yes, it should, because obj is an object of type A! It is also an object of type B, but that is not necessarily known to the one using the object.
 * Every object of type A must adhere to the contract (interface) for A. B extends A and must therefore also adhere to that contract.
 */

package org.learn.java.inheritance;

import org.learn.java.inheritance.examples.InheritanceExample;

public class TryInheritance {

    private InheritanceExample protectedExample;

    public InheritanceExample getProtectedExample() {
        return new InheritanceExample();
    }

    public static void main (String[] args){

       //We cannot access getName() since get Name is protected method
       // new TryInheritance().getProtectedExample().getName()

    }
}


class MyInheritanceWay extends  InheritanceExample {

    public static void main(String []args){
        //getName is visible
        new MyInheritanceWay().getName();


        // get Addres is not visible
        //new MyInheritanceWay().getAddress();
    }
}