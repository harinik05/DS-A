class MajorityElement_Soln2 {
    public int majorityElement(int[] nums) {
        //1. decide on the max element
        int max = nums.length/2;

        //2. sort the array 
        Arrays.sort(nums);
        int counter = 1;
        if(nums.length<=1){
            return nums[0];
        }
        //3. loop through the entire array now
        for(int i = 1;i<nums.length;i++){
            //check if the element is equal to the previous one
            if(nums[i]== nums[i-1]){
                counter++;
            }
            if(counter>max){
                return nums[i];
            }
        }

        //4. return -1 if this is not valid
        return -1;
    }
}
