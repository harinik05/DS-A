# Algorithm to Solve Question 133

Here is the list of steps that has to be taken to solve this question. This can be done in the runtime of the following:

Time: O(V+E)
Space: O(N)

## Steps to complete this question
1. Define a member variable (master hashmap)
2. Define the clone graph function which is supposed to return the clone node
3. Check if the node is null. If it is, then return node
4. check if the node is already visited. so the hashmap has to have duplicate value, then return the duplicate
5. else, create your own duplicate value and place it in the hashmap
6. Iterate the neighbors and put in the new ones using recursion
