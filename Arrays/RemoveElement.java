package Arrays;
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //1. skip
        int skip = 0;
        //skip = slower pointer

        //2. 
        for(int i = 0;i<nums.length;i++){
            //if no duplicates, then skip
            if(nums[i] != val){
                nums[skip] = nums[i];
                skip++;
            }
        }
        return skip;
    }
}