package org.learn.java.anonymus.classes.map.examples;


import java.util.HashMap;

/***
 * This code set object as key in hash map
 * Object will have same set of stringd as member variable
 * Objects has ame and org as "Suyash", "cambium" respectively
 * Default hash code will be different for both
 * Default equals will be different for both
 *
 * Conclusion: if we override just hash code two different object wil be there because of equals methid
 *
 * unccomment and play with hash code nd equal in below method
 *
 * Note** Hashcode and equals both are defined in object method
 *
 *
 */
class HashMapObject {
    private String name;
    private String organisation;

    HashMapObject(String name, String  organisation){
        this.name = name;
        this.organisation = organisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    //******Comment one of the method and comment both of method to play around

    /*@Override
    public int hashCode() {
        return 101;
    }*/

   /* @Override
    public boolean equals(Object obj) {
        if(obj instanceof  HashMapObject){
           if(((HashMapObject) obj).name == this.name){
               return true;
           }
        }
        return false;
    }*/
}


public class HashMapWorking {

    HashMap<HashMapObject, String>  myHashMap = new  HashMap();


    private void addObject(HashMapObject obj, String val){
        myHashMap.put(obj,val);
    }

    public HashMap<HashMapObject, String> getMyHashMap() {
        return myHashMap;
    }

    public void setMyHashMap(HashMap<HashMapObject, String> myHashMap) {
        this.myHashMap = myHashMap;
    }

    public static void main(String [] args){
        HashMapWorking hashMapWorking = new HashMapWorking();

        HashMapObject hashMapObject = new HashMapObject("Suyash", "cambium");
        hashMapWorking.addObject(hashMapObject, "Employee Suyash");

        HashMapObject secondKeyObject = new HashMapObject("Suyash", "cambium");
        hashMapWorking.addObject(secondKeyObject, "Employee Suyash copy with same key");


        System.out.println("Total entries when created object as key with same member variables: " +
                hashMapWorking.getMyHashMap().size());
        System.out.println("hash code for --> hashMapObject is "+ hashMapObject.hashCode());
        System.out.println("hash code for --> secondKeyObject is "+ secondKeyObject.hashCode());

        System.out.println("***IS EQUALS CODE same for hashMapObject & secondKeyObject is "+ hashMapObject.equals(secondKeyObject));

    }
}
