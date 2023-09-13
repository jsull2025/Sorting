import java.util.Arrays;
/**
 * Creates a new Sorting class that is used to perform sorting
 * methods for integer arrays. Sorts the integer array by using bubble sort, 
 * selection sort, insertion sort and merge sort. 
 *
 * @author jiun
 * @version 9/13/23
 */
public class Sorting
{
    private static long mergeAssignments; 
    private static long mergeComparisons;

    /**
     * Sorts the given integer array from least to greatest by using bubble sort
     *
     * @param arr integer array to be bubble sorted
     */
    public static void bubbleSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) { // swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
                comparisons++;
            }
        }
        System.out.print(", " + comparisons + ", " + swaps);
    }
    
    /**
     * Sorts the given integer array from least to greatest by using selection sort
     *
     * @param arr integer array to be selection sorted
     */
    public static void selectionSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        
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
        System.out.print(", " + comparisons + ", " + swaps);
    }
    
    /**
     * Sorts the given integer array from least to greatest by using insertion sort
     *
     * @param arr integer array to be insertion sorted
     */
    public static void insertionSort(int[] arr) {
        long comparisons = 0;
        long assignments = 0;
        
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int cur = i - 1;
            while (cur > -1 && temp < arr[cur]) { 
                arr[cur+1] = arr[cur];
                cur--;
                assignments++;
                comparisons++;
            }
            arr[cur+1] = temp;
            assignments++;
            comparisons++;
        }
        System.out.print(", " + comparisons + ", " + assignments/3);
    }
    
    /**
     * Sorts the given integer array from least to greatest by using merge sort
     *
     * @param arr integer array to be merge sorted
     */
    public static void mergeSort(int[] arr) {
        mergeComparisons = 0;
        mergeAssignments = 0;
        mergeSort(0, arr.length - 1, arr);
        System.out.print(", " + mergeComparisons + ", " + mergeAssignments/3);
    }
    
    /**
     * Splits the array into half using recursion until the individual
     * array has one element, then merges back
     *
     * @param beg the beginning of the array
     * @param end the end of the array
     * @param arr the integer array to be sorted
     */
    private static void mergeSort(int beg, int end, int[] arr) {
        if (beg == end) { // base case
            return;
        } else {
            int mid = (beg + end)/2;
            mergeSort(beg, mid, arr);
            mergeSort(mid + 1, end, arr);
            merge(arr, beg, end, mid);
        }
    }
    
    /**
     * Merges the array in a new sorted array from least to greatest
     *
     * @param arr the integer array to be sorted
     * @param beg the beginning of the array
     * @param end the end of the array
     * @param mid the middle of the array
     */
    private static void merge(int[] arr, int beg, int end, int mid) {
        int i = 0;
        int left = beg;
        int right = mid + 1;
        int[] arr2 = new int[end-beg+1];
        
        // runs through both partitions simultaneously
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
            mergeComparisons++;
            mergeAssignments++;
        }
        
        // run through what is left of partitions
        while (left <= mid) {
            arr2[i] = arr[left];
            left++;
            i++;
            mergeAssignments++;
        }
        
        // run through what is left of partitions
        while (right <= end) {
            arr2[i] = arr[right];
            right++;
            i++;
            mergeAssignments++;
        }
        
        // copys new into original array
        for (int j = 0; j < arr2.length; j++) {
            arr[j+beg] = arr2[j];
            mergeAssignments++;
        }
    }
    
    /**
     * Tests the insertion sort using four separate integer arrays and prints
     */
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
