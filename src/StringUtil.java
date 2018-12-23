/**
 * 
 * Last name: 
 * First name: 
 * Student ID: 
 * Period: 
 *
 */
/**
 * Write a one sentence summary about your class
 */
 public class StringUtil { // Declare instance variables here
	String backward;
	private static String newText;
	private static Boolean noVowel = false;
	private static Boolean firstVowel = false;
	private static Boolean yesVowel = false;

	public static void main(String[] args) {
		System.out.println(phraseToPigLatin("yall")); 
	}

	/**
	 * Write a one sentence description of the method Describe the parameters
	 * and return values
	 */
	public static String reverse(String str) {
		if (str.length() < 1)
			return str;
		else
			return reverse(str.substring(1)) + str.charAt(0);

	}

	/**
	 * Write a one sentence description of the method Describe the parameters
	 * and return values
	 */
	private static String palindromeSetUp(String str) {
		str.toLowerCase();
		if (str.length() < 1)
			return str;
		else {
			if ((str.charAt(0) >= 97 && str.charAt(0) <= 122) || str.charAt(0) >= 65 && str.charAt(0) <= 90) {
				return str.charAt(0) + palindromeSetUp(str.substring(1));
			}
			return palindromeSetUp(str.substring(1));
		}

	}

	public static boolean palindrome(String str) {
		str = str.toLowerCase();
		str = palindromeSetUp(str);
		if (str.equals(reverse(str)))
			return true;
		else
			return false;

	}

	/**
	 * Write one sentence description of the method
	 * Describe the parameters and return values
	 */

	public static String phraseToPigLatin(String text) 
	{
		if(text.length() > 0){
			if(!firstVowel && !yesVowel && (text.charAt(0) != 'a'  || text.charAt(0) != 'e' || text.charAt(0) != 'i' || text.charAt(0) != '0' || text.charAt(0) != 'u')){
				newText = text.charAt(0) + phraseToPigLatin(text.substring(1));
				noVowel =true;
				return newText + "ay";
			}else if(!noVowel && !yesVowel && text.charAt(0) == 'a' || text.charAt(0) != 'e' || text.charAt(0) != 'i' || text.charAt(0) != '0' || text.charAt(0) != 'u'){
				firstVowel = true;
				return text + "yay";
			}else if(!noVowel && !firstVowel){
				yesVowel = true;
				//  int vowelIndex = 0;
				if(text.charAt(1) == 'a' || text.charAt(1) == 'e'  || text.charAt(1) == 'i'  || text.charAt(1) == 'o' || text.charAt(1) == 'u'){
					char vowel = text.charAt(1);
					String start = text.substring(0, text.indexOf(vowel));
					String end  = text.substring(text.indexOf(vowel), text.length() - 1);
				}else return text.charAt(1) + phraseToPigLatin(text.substring(1));

			}
		}return "";
	}
}