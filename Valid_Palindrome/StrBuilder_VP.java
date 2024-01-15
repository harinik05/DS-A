package Valid_Palindrome;

public class StrBuilder_VP {
    public boolean formPalindromicString(String inString){
        //1. Reverse the string thats given and check if its equal
        StringBuilder palindromeString = new StringBuilder();
        palindromeString.reverse();

        //2. check if its equal with the initial string
        return palindromeString.toString().equals(inString);
    }

    public String preProcessMethod(String inString){
        //a. convert to lower case
        inString = inString.toLowerCase();
    
        //b. remove all non-alphabetic characters
        inString = inString.replaceAll("[^a-zA-Z0-9]", "");
        
        return inString;
    }

    public static void main(String[] args){
    }
    

    
}
