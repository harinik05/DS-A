package Valid_Palindrome;

class TwoPtrs_VP {
    public boolean isPalindrome(String s) {
        //1. initiate the first and last pointers
        int first = 0;
        int last = s.length()-1;

        //2. for loop
        while(first<last){
            //a. ignoring non-valid characters
            while(first<last && !Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }

            //b. ignoring non-valid characters
            while(first < last && !Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }

            //c. false if they aren't equal
            if(s.toLowerCase().charAt(last)!= s.toLowerCase().charAt(first)){
                return false;
            }

            //d. increment
            first++;
            last--;

        }
        return true;
    }
}