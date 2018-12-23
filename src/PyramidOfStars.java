
public class PyramidOfStars {
	/**
	 * Method to make a pyramid
	 * 
	 * @param n
	 *            - height of the pyramid
	 */
	public static void pyramid(int n) {

//		}
		int line = 0;
		int spaces = 0;
		int numCurrStars = 1;
		int numPrevStars = 0;
		for(line = n; line > 0; line--){
			spaces = line - 1;
			for(int i = 0; i <= spaces; i++){
				System.out.print(" ");
			}
			
			for(int j = 0; j < numCurrStars; j++){
				System.out.print("*");
			}
			numPrevStars = numCurrStars;
			numCurrStars +=2;
			System.out.println();
			
		}
	}
}
