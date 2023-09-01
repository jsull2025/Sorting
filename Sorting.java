
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
    public void merge(int[] arr, int beg, int end, int mid) {
        
        int left = beg;
        int right = mid + 1;
        int[] arr2 = new int[end+1]
        
        while (left <= mid || right <= end) {
            if (arr[left] < arr[right]) {
                arr[beg] == arr[left]
            }
        }
        
    }
    
    public void mergeSort(int[] arr) {
        mergeSort(0, arr.length - 1, arr);
    
    }
    
    public void mergeSort(int beg, int end, int[] arr) {
        if (beg == end) {
            return;
        } else {
            int mid = (beg + end)/2;
            mergeSort(beg, mid, arr);
            mergeSort(mid + 1, end, arr);
            merge(arr, beg, end, mid);
            
            
        }
        
    }
    
    public void testSorting() {
        int[] arr1 = {23, 10, 55, 73, 62};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {-4, 2, 0, 4, 1};
        int[] arr4 = {2, 2, 0, 4, 10};
        mergeSort(arr1);
        mergeSort(arr2);
        mergeSort(arr3);
        mergeSort(arr4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
    
}
