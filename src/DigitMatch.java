/**
 * 
 * @author your name
 * period #
 */
public class DigitMatch {
	/**
	 * Counts the number of matching digits in the two given integers
	 * @param x - first integer
	 * @param y - second integer
	 * @return number of matching digits
	 */
	int count = 0; 
	public int countMatch(int x, int y) {
		//Your code goes here
		
		if(!(x / 10 == 0 || y / 10 == 0)){
			if(x % 10 == y % 10) {
				count++;
				return countMatch(x / 10, y / 10);
			}
			return countMatch(x/10, y / 10);
		}else if(x % 10 == y % 10) return count ++;
		return count;
		
		
	
	}
}

/*
 * countMatch(38, 34)
 * !38/10 || 34/10 --> true
 * 38 % 10 = 8 != 34 % 10 == 4
 * 		countMatch(3, 3)
 * 		!3/10 || 3/10 --> false
 * 		3 % 10 == 3 % 10 -->  count = 1
 * `	
*/
