package Arrays;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        //define the skip
        int skip = 0;

        //loop through the entire array
        for(int i = 0;i<nums.length-1;i++){
            //a. duplicates dont exist
            if(nums[i] != nums[i+1]){
                nums[skip] = nums[i];
                skip++;
            }
        }

        //take care of the last element
        nums[skip] = nums[nums.length-1];
        skip++;
        return skip;
    }
}
