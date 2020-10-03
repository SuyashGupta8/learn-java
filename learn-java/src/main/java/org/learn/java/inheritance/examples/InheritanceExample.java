package org.learn.java.inheritance.examples;

public class InheritanceExample {
    private String name, address;

    protected String getName(){
        return this.name;
    }

    private String getAddress(){
        return this.address;
    }

    protected String getName(String greetings){
        return  greetings + " " + this.name;
    }

    protected void setName(String inp){
        this.name = inp;
    }

    protected boolean isName(){
        if(this.name != null){
            return true;
        }
        return  false;
    }

    /**
     * to check if we can access static method in child
     * @return
     */
    static String staticMethodInParent(){
        return "staticMethodInParent";
    }

    //Trying to overload above method
    //If we un comment this method it will give compile error saying already defined.
    // Compiler does not include return type to differentiate the function
    /*protected int isName(){
        if(this.name != null){
            return -1;
        }
        return 0;
    }*/
}
