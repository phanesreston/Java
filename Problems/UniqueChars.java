import java.util.*

/* 
  Write a method that takes in an input String and returns true if all the characters in the String are unique
  and false if there is even a single repeated character.
  The method should return true if the input is null or empty String.
*/

public static boolean areAllCharactersUnique(String str){
    if (str == null) {
        return true;
    } else {
        for (int i = 0; i < str.length(); i++) 
            for (int j = i + 1; j < str.length(); j++) 
                if (str.charAt(i) == str.charAt(j)) 
                    return false; 
                    
        return true; 
    }
}
