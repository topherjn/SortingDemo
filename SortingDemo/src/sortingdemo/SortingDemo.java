/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicholson
 */
public class SortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int SIZE;
        
        
        System.out.println("How many values in the array?");
        SIZE = Integer.parseInt(scanner.nextLine());
        
        int [] numbers = new int[SIZE];
        
        for(int i = 0; i < numbers.length;i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        
        for(int number : numbers) {
            System.out.println(number);
        }
        
        bubbleSort(numbers);
        
        System.out.println("\n");
        for(int number : numbers) {
            System.out.println(number);
        }
        
        
    }
    
    public static void bubbleSort(int [] array) {
        
        for(int i = 0; i < array.length;i++)
            for(int j = 0; j < array.length - 1;j++) {
                if(array[j] > array[j+1])
                    swap(array,j,j+1);
            } 
        
    }
    
    public static void swap(int [] array, int left, int right) {
        
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    
}
