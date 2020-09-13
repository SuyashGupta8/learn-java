/***
 * Below are streaming examples in java
 * intermediate operations are: 1) map, 2) filter, 3) sorted
 *
 * terminal operation are 1) collect 2) for each 3) reduce
 *
 *
 */

package org.learn.java.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    private static List numbers = Arrays.asList(2,3,5,6,7);

    public static void main(String[] args){

        /**
         * 1) use of map tp convert streams to even numbers
         */

        List evenNumbers = (List) numbers.stream().map((num)->{

            //This exmample will convert array to numbers of even array
            if(((int)num)% 2 == 1){
                num = (int)num + 1;
            }
            return num;
        }).collect(Collectors.toList());
       System.out.println("printing list of even nubers" + evenNumbers.toString());

        /**
         * 2) use of filter to filter odd elements from Array
         */
       List oddNumbers =  (List) numbers.stream().filter( (num) -> {
           if((int)num % 2 == 0){
               return false;
           }
           return true;
       }).collect(Collectors.toList());
        System.out.println("printing list of odd numbers" + oddNumbers.toString());


        /**
         * Below example will calcualte sum of all array elements
         *
         * With base value of sum as 8
         */
        int total  = (int) numbers.stream().reduce(8, ( sum, i) -> {
            return (int)sum + (int) i;
        });
        System.out.println("Total Sum is: " + total);

    }
}
