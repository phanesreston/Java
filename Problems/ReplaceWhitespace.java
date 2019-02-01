import java.util.*
import java.util.streams.*

/* 
  Write a method to replace all spaces in a string with a given replacement string. 
  (Without using the in-built String.replaceAll() method.)
*/

/*
  Method using replaceAll()
  
  public static String replace(String a, String b) {
      a = a.replaceAll("\\s+",b);
      return a;
  }
*/

public static String replace(String a, String b) {
      StringBuilder builder = new StringBuilder();
      for(int i = 0; i < a.length(); i++){
          char c = a.charAt(i);
          if(c == ' ') builder.append(b);
          else builder.append(c);
      }
      return builder.toString();
}
