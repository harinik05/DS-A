package Valid_Palindrome;

public class Valid_Palindrome_Sol {

    //method for finding the palindrome
    public String returnPalindrome(String inString){
        //a. convert to lower case
        inString = inString.toLowerCase();

        //b. remove all non-alphabetic characters
        inString = inString.replaceAll("[a-zA-Z0-9]", "");

        //c. put into a char array
        char[] charArr = inString.toCharArray();
        inString = "";

        //d. loop through the entire char array and put in a result string
        for(int i = charArr.length-1;i>=0;i--){
            inString+=charArr[i];
        }

        //e. return the inString
        return inString;
    }

    //method 2: check if its a palindrome
    public boolean checkIfPalindrome(String inString){
        String palindromeString = returnPalindrome(inString);
        boolean val = (palindromeString == inString)? true:false;
        return val;
    }

    public static void main(String[] args){
        //create an object
        Valid_Palindrome_Sol obj = new Valid_Palindrome_Sol();
        boolean result = obj.checkIfPalindrome("super");
        System.out.println(result);
        
    }
}
