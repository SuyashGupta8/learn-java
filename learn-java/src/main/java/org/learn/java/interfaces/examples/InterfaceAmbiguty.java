package org.learn.java.interfaces.examples;

/**
 * This class contains default method , static method in interfaces
 *
 * Also contain abstract method
 *
 * If default method is present in both interface we need to override
 * We can call particular implementation also by interfaceB.super.commonDefautMethod() as shared below
 *
 * Also if two interface which have same abstract methodit will not create issueif we override common method
 */
interface  interfaceA {
    abstract String buildMethodA();

    abstract String buildCommonMethod();

    default  String getDefaultMethodInA(){
        return  "getDefaultMethodInA";
    }

    static String getStaticMethodInA(){
        return  "getStaticMethodInA";
    }

    default  String commonDefautMethod(){
        return  "commonDefautMethod";
    }
}

interface  interfaceB {
    abstract String buildMethodB();

    abstract String buildCommonMethod();

    default  String getDefaultMethodInB(){
        return  "getDefaultMethodInB";
    }

    static String getStaticMethodInB(){
        return  "getStaticMethodInB";
    }

    default  String commonDefautMethod(){
        return  "commonDefautMethod";
    }
}


public class InterfaceAmbiguty implements interfaceA, interfaceB {

    @Override
    public String buildMethodA() {
        return "buildMethodA Implementaiton";
    }

    @Override
    public String buildMethodB() {
        return "buildMethodB Implementation";
    }

    @Override
    public String buildCommonMethod() {
        return "Common method Implementation";
    }

    @Override
    public String commonDefautMethod(){
        return  interfaceB.super.commonDefautMethod();
    }


    public  static  void main (String [] args){
        InterfaceAmbiguty interfaceAmbiguty= new InterfaceAmbiguty();

        System.out.println(interfaceAmbiguty.buildMethodA());
        System.out.println(interfaceAmbiguty.buildMethodB());
        System.out.println(interfaceAmbiguty.buildCommonMethod());
        System.out.println(interfaceAmbiguty.commonDefautMethod());
        System.out.println(interfaceAmbiguty.getDefaultMethodInA());
        System.out.println(interfaceAmbiguty.getDefaultMethodInB());
        System.out.println(interfaceB.getStaticMethodInB());


    }
}
