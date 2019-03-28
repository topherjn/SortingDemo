/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo;

import java.util.Random;

public class SortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // set up for generating random numbers
        Random random = new Random();
        
        // create an array to store 20 integers
        final int SIZE = 20;
        int[] numbers = new int[SIZE];

        // fill up the array with 2-digit numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }
        
        // display the original array
        System.out.println("Original random array of 20 2-digit integers: ");
        printArray(numbers);
        
        // start a timer on the JVM clock
        long startTime = System.nanoTime();
        
        // perform the sort
        insertionSort(numbers);
       
        // click stop on the stop watch
        long endTime = System.nanoTime(); 

        // print out the final sorted array
        printArray(numbers);
        
        // print out how long it took to sort
        System.out.println("\n\nTime elapsed: " + (endTime - startTime));

    }

    // prints out the elements of an integer array hopefull in a pretty way
    public static void printArray(int[] array) {
        System.out.println("\n");
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("| %d ", array[i]);
        }
        System.out.println("|");
    }

    public static void bubbleSort(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -  i - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    System.out.printf("Pass %d: Swap indices %d and %d\n",i+1,j,j+1);
                    swap(array, j, j + 1);
                }
            }
        }
//        System.out.println(count);
    }

    public static void insertionSort(int[] array) {
        
        // i is the index of how far in the array is sorted so far
        // key is the next number to insert into the right spot
        // j helps in the shifting of numbers to make room for key
        int i, key, j;
        
        // the outer loop goes through each element in the array
        for (i = 1; i < array.length; i++) {
            
            // key is the next element to insert
            key = array[i];
            
            // i - 1 is the furthest element sorted so far
            j = i - 1;

            // if j is bigger than the key, then swap
            // keep doing this until we get to the beginning of the array
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j--];
//                j--;
            }
            
            // key should be insert in front of the first j
            // that isn't bigger than key
            array[j + 1] = key;
            
            // comment this out to stop seeing results of each pass
            printArray(array);
        }
    }

    // given and array and two indices, this method will swap the elements
    // located at those indices
    public static void swap(int[] array, int left, int right) {

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
