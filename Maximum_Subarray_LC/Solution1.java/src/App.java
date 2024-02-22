public class App {

    //1. Describe and initialize 
    private int currentSum;
    private int totalSum;

    //2. Describe the function
    public int maxSumArray(int[] nums){
        //1. initialize the values for these variables 
        currentSum = 0;
        totalSum = nums[0];

        //2. for loop to go through all the elements 
        for(int number: nums){
            if(currentSum<0){
                currentSum=0;
            }
            currentSum+=number;
            totalSum = Math.max(currentSum, totalSum);

        }

        return totalSum;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
