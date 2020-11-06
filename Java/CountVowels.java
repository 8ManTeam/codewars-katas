/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
package countVowels;

public class CountVowels {

	public static int getCount(String str) {
		int vowelsCount = 0;
		/*Convert String to Uppercase*/
		String upper=str.toUpperCase();
		/*Creating array of string length*/ 
		char[] ch = new char[upper.length()]; 
		ch =upper.toCharArray();
		for(int i=0;i<upper.length();i++){
			if((ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')){
				vowelsCount =vowelsCount+ 1;	
			}
		}
		return vowelsCount;
	}
}
