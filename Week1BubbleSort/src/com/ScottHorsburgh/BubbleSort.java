package com.ScottHorsburgh;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted){
            //set to true to continue while loop
            isSorted = true;
            //loops through array and makes sure to not go out of bounds on last index
            for (int i = 0; i < arr.length - 1; i++){
                //if first element is greater than following element it swaps and sets isSorted to false
                //to continue the while loop and check array
                if (arr[i] > arr[i + 1]){
                    swapElements(arr, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    public static void swapElements(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
