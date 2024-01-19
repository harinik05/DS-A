package GroupAnagrams_LCBook;

import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = Arrays.binarySearch(sortedArray, target);

        if (result >= 0) {
            System.out.println("Target found at index: " + result);
        } else {
            int insertionPoint = -result - 1;
            System.out.println("Target not found. Insertion point: " + insertionPoint);
        }
    }
}

