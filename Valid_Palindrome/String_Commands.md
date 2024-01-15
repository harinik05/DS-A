# String Commands

## 1. Reversing a string all in one go
This doesnt involve the use of a for loop
```
StringBuilder newStr = new StringBuilder();
newStr = newStr.reverse().toString();
return newStr.equals(origStr);
```

## 2. Check if something is letter or digit
do it for a character
```
Character.isLetterOrDigit(c)
```

do it for the entire string
```
newStr.replaceAll("[^a-zA-Z0-9]","")
```

## 3. Convert string to char array
```
Char[] newArr = newStr.toCharArray();
str.charAt(index);   //loop through and determine char by string
```