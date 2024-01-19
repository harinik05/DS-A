//package Sorted_Merge_LCBook;

public class ArraySoln {
    //1. private member variables
    private int[] arrayA;
    private int[] arrayB;
    private int mergedIndx;
    private int arrALen;
    private int arrBLen;

    //2. constructor
    public ArraySoln(int[] inArrA, int[] inArrB){
        this.arrayA = inArrA;
        this.arrayB = inArrB;
        this.mergedIndx = this.arrayA.length + this.arrayB.length -1;
        this.arrALen = inArrA.length;
        this.arrBLen = inArrB.length;
       // this.arrayA = new int[inArrA.length + inArrB.length];
    }

    //3. method to take care of merging both arrays
    public void mergeTwoArrays(){
        //1. start comparing the elements from the end of the array
        while(arrALen > 0 && arrBLen > 0){
            if(arrayA[arrALen] > arrayB[arrBLen-1]){
                arrayA[mergedIndx] = arrayA[arrALen-1];
                arrALen--;
                mergedIndx--;
            }else{
                arrayA[mergedIndx] = arrayB[arrBLen-1];
                arrBLen--;
                mergedIndx--;
            }
        }

        //2. remaining elements
        while(arrBLen>0){
            arrayA[mergedIndx] = arrayB[arrBLen-1];
            mergedIndx--;
            arrBLen--;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {2,3,6,7,9,10};
        ArraySoln obj = new ArraySoln(nums1, nums2);
       // nums1 = new int[nums1.length + nums2.length];
        obj.mergeTwoArrays();

        System.out.println(nums1);
    }
}
