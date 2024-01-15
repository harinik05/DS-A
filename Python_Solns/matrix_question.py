from typing import List
def rotateMatrix(matrix: List[List[int]]):

    #1. rows and columns in the matrix
    rows = len(matrix)
    columns = len(matrix[0])

    #2. 
    matrixRotated = []

    for i in range(rows):
        for j in range(columns):
            temp = matrix[i][j]
            temp_second = matrix[j][rows-1-i]
            matrix[j][rows-1-i] = temp
            matrix[i][j] = temp_second

           # matrixRotated[j][rows-1-i] = matrix[i][j]
    
    return matrix

a = [[1,2,3],[4,5,6],[7,8,9]]
print(rotateMatrix(a))



