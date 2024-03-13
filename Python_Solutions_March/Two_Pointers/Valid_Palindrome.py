# define a class
class Valid_Palindrome:
    # define a constructor
    def __init__(self,s):
        self.s = s
    
    # check if its a valid palindrome
    def is_valid_palindrome(self):
        # clean the word thats given 
        for characters in self.s:
            if characters.isalnum():
                cleaned_string=''.join(characters.lower())
                print(cleaned_string)
        
        # check if its equal to the reversed version
        return cleaned_string == cleaned_string[::-1]
    

# main method
if __name__ == "__main__":
    input_string = "madam"
    # create the object
    palindrome_object = Valid_Palindrome(input_string)

    # CHECK IF ITS A PALINDROME
    if(palindrome_object.is_valid_palindrome()):
        print("this is a palindrome and its true")
    else:
        print("this isn't a palindrome and its false")