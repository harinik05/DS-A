public class App {

    //1. initialize the variables
    private int goalPost;

    //2. define a function for this
    public boolean canJump(int[] nums){
        //1. start from the last one 
        goalPost = nums.length-1;

        //2. start from the last and go through all of them
        for(int i = nums.length-1;i>0;i--){
            //a. check if the value at prev is good enough to jump next
            if(nums[goalPost])
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
