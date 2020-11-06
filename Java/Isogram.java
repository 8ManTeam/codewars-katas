package isogramCheck;

/**
 * An isogram is a word that has no repeating letters, 
 * consecutive or non-consecutive. Implement a function 
 * that determines whether a string that contains only 
 * letters is an isogram. Assume the empty string is an 
 * isogram. Ignore letter case.
 * 
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "aba" == false
 * isIsogram "moOse" == false -- ignore letter case
 *
 */

public class Isogram {

	
	public static boolean  isIsogram(String str) {
		  boolean isIsogram = true;
		  if(str.equalsIgnoreCase("")){
			 return true;  
		  }
		  
	      char[] carray = str.toLowerCase().toCharArray();
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               return false;
	            }
	         }
	      }
		return isIsogram;
    } 

}
