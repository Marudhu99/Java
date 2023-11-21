package org.example;

import java.util.Arrays;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        //PRIMITIVE DATA TYPES - Pre defined data types
        /*
        * Stored in a stack.
        * Two different variables is created along with different assignment(only values are same).
        * */
        int x = 10;
        int y = x;
        System.out.println("Before for Primitive data type:-");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        y = 30;
        System.out.println("After for Primitive data type:-");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        //REFERENCE DATA TYPES - User defined data types
        /*
        * Reference variable is stored in stack and the original object is stored in heap.
        * Two reference variable is created but both are pointing to the same object on the heap.
        * Changes reflected in the original ones.
        * The default value for the reference variable is null
        */
        int[] c = {10, 20, 30, 40};
        int[] d = c;
        System.out.println("Before for the Reference data types:");
        System.out.println("c:" + Arrays.toString(c));
        System.out.println("d:" + Arrays.toString(d));
        d[1] = 50;
        System.out.println("After for the Reference data types:");
        System.out.println("c:" + Arrays.toString(c));
        System.out.println("d:" + Arrays.toString(d));
    }

}
