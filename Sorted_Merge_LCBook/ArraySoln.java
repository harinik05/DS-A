package Sorted_Merge_LCBook;

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
        

    }
    public static void main(String[] args){

    }
}
