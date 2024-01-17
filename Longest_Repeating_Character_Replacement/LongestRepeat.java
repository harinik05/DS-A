package Longest_Repeating_Character_Replacement;

public class LongestRepeat {

    //1. define the data structure required to store the values
    private int[] mainStruct;

    //2. define a constructor
    public LongestRepeat(){
        this.mainStruct = new int[26];
    }

    //3. define the sliding window method
    public int performSlidingWindow(String s, int k){
        //1. define the windows
        int leftWindow = 0;
        int rightWindow = 0;
        //2. convert s to array
        char[] charArr = s.toCharArray();
        int count = 0;
        int output = 0;
        //3. loop through the array
        for(;rightWindow<s.length();rightWindow++){
            mainStruct[charArr[rightWindow]-'A']++;
            count = Math.max(count, mainStruct[charArr[rightWindow]-'A']);
            while(rightWindow - leftWindow +1 - count > k){
                //4. adjust the left window
                mainStruct[charArr[leftWindow]-'A']--;
                leftWindow++;
            }

            //5. calculate the output
            output = Math.max(output,rightWindow-leftWindow+1);
        }
        //6. return the output
        return output;
    }
    public static void main(String[] args){

    }
}
