package Valid_Palindrome;

public class StrBuilder_VP {
    public boolean formPalindromicString(String inString){
        //1. Reverse the string thats given and check if its equal
        StringBuilder palindromeString = new StringBuilder();
        palindromeString.reverse();

        //2. check if its equal with the initial string
        return palindromeString.equals(inString);
    }

    
}
