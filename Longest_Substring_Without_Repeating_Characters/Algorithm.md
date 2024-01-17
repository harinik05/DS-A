# Algorithm to do sliding window question

1. Check if its a sliding window question: whenever the keyword substrings is mentioned, 
this is most likely a question that deals with sliding windows
2. Initialize the correct dsa: array or hashset
3. Initialize the right and left windows (same initially)
4. Loop through the right window
5. Skip the unnecessary and readjust the left (while loop)  --> mainStruct[charArr[rightWindow]-'a']
6. keep on adding the things from the right
7. calculate the output
8. return the output