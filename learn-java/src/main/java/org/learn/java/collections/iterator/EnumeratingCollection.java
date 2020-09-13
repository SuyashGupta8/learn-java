/***
 * We can iterate over list by enumeration also.Below examples shows the samezzzzzzzz
 */

package org.learn.java.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumeratingCollection {

    public static void main(String a[]){

        List<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        Enumeration<String> enm = Collections.enumeration(ls);
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }

}
