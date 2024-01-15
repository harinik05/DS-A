package Valid_Palindrome;

class Valid_Palindrome_Sol extends StrBuilder_VP {
    public String returnPalindrome(String inString){

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

   public boolean checkIfPalindrome(String inString){
       //a. convert to lower case
       inString = inString.toLowerCase();

       //b. remove all non-alphabetic characters
       inString = inString.replaceAll("[^a-zA-Z0-9]", "");
       String palindromeString = returnPalindrome(inString);
       boolean val = (palindromeString.equals(inString))? true:false;
       return val;
   }

   public boolean checkIfPalindrome_SecondMethod(String inString){
    //a. convert to lower case
    inString = inString.toLowerCase();

    //b. remove all non-alphabetic characters
    inString = inString.replaceAll("[^a-zA-Z0-9]", "");
    
    return formPalindromicString(inString);
}

   public boolean isPalindrome(String s) {
       boolean result = checkIfPalindrome(s);
       return result;
   }

   public static void main(String[] args){
        Valid_Palindrome_Sol obj = new Valid_Palindrome_Sol();
        System.out.println(obj.isPalindrome("null"));

        Valid_Palindrome_Sol obj2 = new Valid_Palindrome_Sol();
        System.out.println(obj2.checkIfPalindrome_SecondMethod("null"));
   }
}