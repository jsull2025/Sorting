
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Sorting
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Sorting
     */
    public Sorting()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void bubbleSort(int[] arr)
    {
        // put your code here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                
                
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
    }
    
    public void selectionSort(int[] arr) {
        
        for(int i = 0; i < arr.length - 1; i++) {
            int minLocation = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[minLocation]) {
                    minLocation = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minLocation];
            arr[minLocation] = temp;
        }
        
    }
    
    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; )
    }
    
    public void testSorting() {
        int[] arr1 = {23, 10, 55, 73, 62};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {-4, 2, 0, 4, 1};
        int[] arr4 = {2, 2, 0, 4, 10};
        selectionSort(arr1);
        selectionSort(arr2);
        selectionSort(arr3);
        selectionSort(arr4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
         System.out.println(Arrays.toString(arr4));
    }
    
}
