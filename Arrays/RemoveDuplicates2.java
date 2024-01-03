class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        //1. Define the counter and skip value
        int counter = 1;
        int skip = 1;

        //2. For loop to go through the nums array 
        for(int i = 1;i<nums.length;i++){
            //a. increment the count if the element is a duplicate (doesnt mean its valid)
            if(nums[i] == nums[i-1]){
                counter++;
            }
            else{
                counter = 1;
            }

            //b.check if the count <=2
            if(counter<=2){
                nums[skip++] = nums[i];
            } 
        }
        return skip;
    }
}
