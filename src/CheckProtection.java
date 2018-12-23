/**
 * Name: Sumayya Syeda
 * Period: 2
 * */
import java.util.Scanner;
/**
 * prints the check protected amount of a given amount
 * */
public class CheckProtection {
	
	private String amount;
	private final int MAX_LENGTH;
	private String decimal;
	/**
	 * Constructor prompts For the amount, rounds the amount to two
	 * decimal places checks if the amount entered has a length less than
	 * MAX_LENGTH If the amount exceeds the MAX_LENGTH, prints an error message
	 * If the amount is within range prints the check amount with commas and
	 * spaces filled with *
	 * @param max
	 *    max length of check amount
	 */
	public CheckProtection(int max) 
	{
		MAX_LENGTH = max;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check amount: ");
		amount = sc.nextLine();
		if(amount.indexOf(".") != -1){
		   decimal = amount.substring(amount.indexOf(".")+1, amount.length());
		   
		   if(decimal.length() > 2){
		      char hundreth = decimal.charAt(2);
		      if(hundreth >= 53 && hundreth <= 57){
		         hundreth += 1;
		         decimal = decimal.substring(0, 1) + "" + hundreth;
		      }else{
		    	  decimal = decimal.substring(0, 2);
		      }
		   }else {
		      if(decimal.length() == 1) decimal = decimal.substring(0) + "0";
		      else decimal = decimal.substring(0);
		   
		   }
		   amount = amount.substring(0, amount.indexOf(".")+1) + decimal;
		   
		}else{
			decimal = "00";
			amount += "." + decimal;
		}
		
		if(amount.length() > MAX_LENGTH) System.out.println("Error: Number is too big");
		else{
			amount = addCommas(amount) +"." + decimal;
			amount = addAsterisks(amount);
			printAmount();
		}
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas inserted
	 */
	public String addCommas(String s) 
	{
		if(s.indexOf(".") != -1){
			return addCommas(s.substring(0, s.indexOf(".")));
		}else{
			if(s.length() > 3){
				return addCommas(s.substring(0, s.length() - 3)) + "," + s.substring(s.length() - 3);

			}else{
				
				return s;
			}
		}
		
	}

	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with leading stars
	 */
	public String addAsterisks(String s) 
	{
		if(s.length() == MAX_LENGTH) return s;
		else{
			return addAsterisks("*" + s);
			
		}
	}

	/**
	 * Prints the amount with leading stars and commas in the between
	 */
	public void printAmount() 
	{
		System.out.println("amount = $" + amount);
	}
}