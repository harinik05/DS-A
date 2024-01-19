package Sorted_Merge_LCBook;

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

    public static void main(String[] args){

    }
    
}
