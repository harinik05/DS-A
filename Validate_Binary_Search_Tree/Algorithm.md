# Validating if something is a BST
1. BST VALIDATION = USE DFS = CHECK VALID NODE OR NOT
2. Define a helper method and this will be a recursive call to each of the nodes
a.) helper method -> input params = TreeNode root, Integer lo, Integer hi
b.) Base case
c.) else case to invalidate if its not in the limits of lo or hi
d.) set up left and right
e.) validate left and right
3. return the result of the helper function with lo and hi set as null in the main function that im running on. 