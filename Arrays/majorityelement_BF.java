class majorityelement_BF {
    public int majorityElement(int[] nums) {
        //this is done through the brute force method
        //Majority element is the one that pops up more than n/2 times 

        //1. define the tolerance for max
        int max = nums.length/2;

        //2. two loops to check the count every time it matched (not arranged in incr order)
        for(int first:nums){
            int counter = 0;
            for(int second:nums){
                if(second == first){
                    counter++;
                }
            }
            if(counter>max){
                return first;
            }
        }
        return -1;
    }
}
