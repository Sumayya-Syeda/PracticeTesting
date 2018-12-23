/**
 * 
 * Last name: Syeda
 * First name: Sumayya
 * Student ID: 53059331
 * Period: 2
 *
 */
public class StringUtil2 
{
	private static boolean hasVowel;
	private static boolean firstVowel;
	private static char vowelChar;
	private static boolean hasYou;
	private static String word;
	  /** 
	  * Converts a string to it piglatin form according to the following rules:
	  * a. If there are no vowels in englishWord, then pigLatinWord is just
	  * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	  * and 'u', and their uppercase counterparts.)
	  * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	  * englishWord + "yay".
	  * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	  * with a vowel), then pigLatinWord is end + start + "ay", where end
	  * and start are defined as follows:
	  * 1. Let start be all of englishWord up to (but not including) its
	  * first vowel.
	  * 2. Let end be all of englishWord from its first vowel on.
	  * 3. But, if englishWord is capitalized, then capitalize end and
	  * "uncapitalize" start.
	  *
	  * 
	  @return piglatin version of text as a String 
	  */
	  public static String phraseToPigLatin(String text) 
	  {
		  if(text.length() > 0){
			  if(text.indexOf(" ") != -1){
				  String eWord = text.substring(0, text.indexOf(" "));
				  if(hasVowel(eWord) == false){
					  word =  word + "ay";
				  }else if(firstVowel(eWord)){
					  word = word + "yay";
				  }else{
					  hasVowel(eWord);
					  word = vowelLatin(eWord);
					  
				  }
				  text = word + " " +  phraseToPigLatin(text.substring(text.indexOf(" ")+1, text.length()));
				  
				  return text;
			  }else{
				  String eWord = text.substring(0, text.length());
				  if(hasVowel(eWord) == false){
					  word =  word + "ay";
				  }else if(firstVowel(eWord)){
					  word = word + "yay";
				  }else{
					  hasVowel(eWord);
					  word = vowelLatin(eWord);
					  
				  }
				  return word;
			  }
		  }else  return "";
			  
	  }
	  
	  public static String shorthand(String text){
		  if(text.indexOf("you") > -1) hasYou = true; 
		  text = replace(text, "and", "&");
		  text = replace(text, "to", "2");
		  text = replace(text, "you", "U");
		  text = replace(text, "for", "4");
		  text = removeVowels(text);
		  return text;		 
	  }
	  private static String replace(String text, String word, String replace){
		  if(text.length() > 0){
			  if(text.indexOf(word) == 0){
				  
				  text =  replace +  shorthand(text.substring(text.indexOf(word) + word.length(), text.length()));
				  return text;
			  }
			  else if(text.indexOf(word) != -1){
				  
				  text =  text.substring(0, text.indexOf(word)) + replace +  shorthand(text.substring(text.indexOf(word) + word.length(), text.length()));
				  return text;
			  }else return text;
		  } return "";
	  }
	  
	  private static String removeVowels(String text){
		  if(text.length() > 0){
			  if(text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u'
				|| text.charAt(0) == 'A' || text.charAt(0) == 'E' || text.charAt(0) == 'I' || text.charAt(0) == 'O' || text.charAt(0) == 'U'){
				  if(text.charAt(0) == 'U' && !hasYou || (hasYou && text.charAt(0) != 'U')) return removeVowels(text.substring(1));
				  
				  
			  }else return "" + text.charAt(0) + removeVowels(text.substring(1));
		  }return text;
	  }
	  
	  
	  
	  
	  private static Boolean hasVowel(String text){
		  if(text.length() > 0){
			  if (text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u'
				|| text.charAt(0) == 'A' || text.charAt(0) == 'E' || text.charAt(0) == 'I' || text.charAt(0) == 'O' || text.charAt(0) == 'U'){
				  vowelChar = text.charAt(0);
				  hasVowel = true;
			  }else {
				  hasVowel(text.substring(1, text.length()));
				  
			  }
		  }
		  return hasVowel;
	  }
	  
	  private static Boolean firstVowel(String text){
		  if(text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u'
			|| text.charAt(0) == 'A' || text.charAt(0) == 'E' || text.charAt(0) == 'I' || text.charAt(0) == 'O' || text.charAt(0) == 'U'){
			  firstVowel = true;
		  }
		  return firstVowel;
	  }
	  
	  private static String vowelLatin(String text){
		  String start = text.substring(0, text.indexOf(vowelChar));
		  String end = "";
		  String ay = "ay";
		  System.out.println(start);
		  if(!((text.charAt(text.length()-1) >= 65 && text.charAt(text.length()-1) >= 90) || (text.charAt(text.length()-1) >= 97 && text.charAt(text.length()-1) >= 122)))
		  {
			  end = text.substring(text.indexOf(vowelChar), text.length()-1);
		  	ay += text.charAt(text.length()-1);
	  } else
			  end = text.substring(text.indexOf(vowelChar), text.length());
		  if(text.charAt(1) >= 65 && text.charAt(1) <= 90){
			  start = start.toLowerCase();
			  end = end.toUpperCase();
			  
		  }
		 // System.out.println(start + "ay");
		  return end + start + ay;
		  
	  }
	  
}