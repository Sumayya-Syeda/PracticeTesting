
public class MagicSquares {
	public void magicSquares(int n) {

		int i = 0;
		int num = 0;
		int sum = 0;
		int square = 0;
		int j = 0;
		String magicSquare = "";
		while (i < n) {

			num++;
			square = num*num;
			j = 0;
			while(sum != square && sum < square){
				sum += j;
				j++;
			}
			if(sum == square){
				magicSquare += square + " ";
				i++;
			}
			sum = 0;
			
		}
		System.out.println("Magic Square: " + magicSquare);

	}
}


