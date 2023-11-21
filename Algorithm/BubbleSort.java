package org.Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Initialization an array
        int a[] = {9, 5, 23, 6, 45, 1};
        //Displaying the array before the sorting
        System.out.println("Before sort array :" + Arrays.toString(a));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
        //Displaying the array after the sorting
        System.out.println("After sort array :" + Arrays.toString(a));
    }

    private void sort(int a[]) {
        //Outer loop for the number of passes
        for (int i = 0; i < a.length-1; i++) {
            //Inner loop for comparisons
            for (int j = 0; j < a.length-1-i; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
    }
}
