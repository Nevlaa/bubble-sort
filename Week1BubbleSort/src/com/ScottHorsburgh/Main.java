package com.ScottHorsburgh;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();

        int arr[] ={5,40,55,4,75,120,8};

        System.out.println();
        //prints out what is in array before using bubble sort
        printDash();
        System.out.println("\nArray Before Bubble Sort");
        printDash();
        System.out.println();
        //loops through array to print out elements
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();
        //using bubblesort method to traverse array
        bubble.bubbleSort(arr);

        //prints out array after using bubble sort
        printDash();
        System.out.println("\nArray After Bubble Sort");
        printDash();
        System.out.println();

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void printDash(){
        for(int i = 0; i < 24; i++){
            System.out.print("-");
        }
    }
}

