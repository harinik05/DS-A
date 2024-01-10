class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        # 1. define an array 
        outputArr = []
        counter = 0
        newArr =[]
        topArr = []

        # 2. define a hashmap to put everything in
        mainHashmap = {}

        #3. place all the elements of the array into the hashmap
        for i in range(len(nums)):
            #a. put everything to the hashmap if it doesnt exist
            if nums[i] not in mainHashmap:
                mainHashmap[nums[i]] = 1
            #b. in the hashmap, increment the counter
            else:
                mainHashmap[nums[i]]+=1
        
        #4. check if k is reached
        for j in range(len(nums)):
            #a. put all the values in
            outputArr.append(mainHashmap[nums[j]])
        
        #5. Sort the output array
        sorted_array = sorted(outputArr)

        #6. Top k elements
        for l in range (k):
            #a. obtain this in element
            newArr.append(sorted_array[k-1-l])
        
        #7. check if its one of the values of the hashtable
        for value in mainHashmap.values():
            if value == newArr[counter]:
                topArr.append(value)
                counter+=1
            
        #5. return the outputArr
        return topArr
        