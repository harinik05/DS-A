//package Sorted_Merge_LCBook;

public class ArraySoln_Space {
    
    //1. here are the private arrays that are given to us
    private int[] array1;
    private int[] array2;
    private int len1;
    private int len2;
    private int[] arrayFinal;

    //2. constructor
    public ArraySoln_Space(int[] array1in, int[] array2in){
        this.array1 = array1in;
        this.array2 = array2in;
        this.len1 = this.array1.length;
        this.len2 = this.array2.length;
        this.arrayFinal = new int[this.len1 + this.len2];
    }

    //3. merge the arrays together
    public void merge2Arrays(int[] minArr, int[] maxArr){
        int i = 0; // pointer for minArr
        int j = 0; // pointer for maxArr
        int counter = 0;

        while (i < minArr.length && j < maxArr.length) {
            if (minArr[i] <= maxArr[j]) {
                arrayFinal[counter] = minArr[i];
                i++;
            } else {
                arrayFinal[counter] = maxArr[j];
                j++;
            }
            counter++;
        }

        // Copy the remaining elements from minArr, if any
        while (i < minArr.length) {
            arrayFinal[counter] = minArr[i];
            i++;
            counter++;
        }

        // Copy the remaining elements from maxArr, if any
        while (j < maxArr.length) {
            arrayFinal[counter] = maxArr[j];
            j++;
            counter++;
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {3,4,5,6,7};
        ArraySoln_Space obj = new ArraySoln_Space(nums1, nums2);

        obj.merge2Arrays(nums1, nums2);

        for(int num: obj.arrayFinal){
            System.out.println(num);
        }
        
    }
    
}
