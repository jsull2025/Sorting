
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
    public static void bubbleSort(int[] arr)
    {
        int comparisons = 0;
        int swaps = 0;
        // put your code here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                
                
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
                comparisons++;
            }
            
        }
        System.out.print(", " + swaps + ", " + comparisons);
    }
    
    public static void selectionSort(int[] arr) {

        int comparisons = 0;
        int swaps = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int minLocation = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[minLocation]) {
                    minLocation = j;
                }
                comparisons++;
            }
            int temp = arr[i];
            arr[i] = arr[minLocation];
            arr[minLocation] = temp;
            swaps++;
        }
        
    }
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int cur = i - 1;
            
            while (cur > -1 && temp < arr[cur]) {
                arr[cur+1] = arr[cur];
                cur--;
            }
            arr[cur+1] = temp;
            
        }
        System.out.print(", " + swaps + ", " + comparisons);
    }
    
    public static void merge(int[] arr, int beg, int end, int mid) {
        
        int i = 0;
        int left = beg;
        int right = mid + 1;
        int[] arr2 = new int[end-beg+1];
        
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                arr2[i] = arr[left];
                left++;
                i++;
            } else {
                arr2[i] = arr[right];
                right++;
                i++;
            }
        }
        
        while (left <= mid) {
            arr2[i] = arr[left];
            left++;
            i++;
        }
        
        while (right <= end) {
            arr2[i] = arr[right];
            right++;
            i++;
        }
        
        for (int j = 0; j < arr2.length; j++) {
            arr[j+beg] = arr2[j];
            
        }
        
    }
    
    public static void mergeSort(int[] arr) {
        mergeSort(0, arr.length - 1, arr);
    
    }
    
    public static void mergeSort(int beg, int end, int[] arr) {
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
        int[] arr1 = {23, 73, 55, 10, 15, 62};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {-4, 2, 0, 4, 1};
        int[] arr4 = {2, 2, 0, 4, 10};
        insertionSort(arr1);
        insertionSort(arr2);
        insertionSort(arr3);
        insertionSort(arr4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
    
}
