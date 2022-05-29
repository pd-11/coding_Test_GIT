/* sort the first half of array in ascending order and second half in descending order
 */
 import java.util.*;
public class que15 {
    static void mySort(Integer[] arr)
    {
        int n = arr.length;
 
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
    }
 
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        Integer[] arr = { 5, 4, 0, -5,6, 2, 10,1, 3, 8, 9, 7 };
        mySort(arr);
        System.out.printf("%s",
                          Arrays.toString(arr));
    }
}

