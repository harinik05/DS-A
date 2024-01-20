# Breath First Search Question

This involves going level by level in order. so i need to go from left to right

1. Define the data structures: list of list and queue for storing all treenodes
2. Insert the root to the queue
3. base case
4. While the queue is not empty, initialize the linked list in the results list
5. loop through the length of queue, remove the element and put in output
6. if non null go to left, and then to right, adding the nodes to the queue
7. increment the level count


--------------------------------------
split this idea into a few parts
1. initializing data structures
2. insert the root to the queue
3. base case
4. loop through queue
5. initialize the linked list
6. level of queue loop
    a. remove element from queue and put in results
    b. put elements into the queue as long as left and right are non null