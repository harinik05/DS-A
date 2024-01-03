class MajorityElement_HM {
    private Map<Integer, Integer> counterOfNumbers(int[] nums){
        //1. create a new hashmap
        Map<Integer, Integer> counterHash = new HashMap<Integer, Integer>();

        //2. Iterate through the entire array 
        //key: number value: occurences
        int counter = 0;
        for(int i = 0;i<nums.length;i++){
            //a. doesnt have the key
            if(!counterHash.containsKey(nums[i])){
                counterHash.put(nums[i], 1);
            }
            //b. the key is there, but you need to increment it
            else{
                counterHash.put(nums[i], counterHash.get(nums[i])+1);
            }
        }
        return counterHash;
    }
    public int majorityElement(int[] nums) {
        //Since we are going by occurences here, use a hashmap effectively
        Map<Integer, Integer> counterMap = counterOfNumbers(nums);

        //loop through the entire thing 
        for(int num: nums){
            if(counterMap.get(num)>(nums.length/2)){
                return num;
            }
        }
        return -1;
        
    }
}
