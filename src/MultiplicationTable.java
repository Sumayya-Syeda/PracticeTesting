
public class MultiplicationTable {
	/**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param mcols - number of columns
     */
	public void printTable(int nrows, int ncols)
	{
		System.out.printf("%9d", 1);
		for(int i = 2; i <= ncols; i++){
			System.out.printf("%7d", i);
		}
		System.out.println();
		System.out.println();
		for(int i = 1; i <= nrows; i++){
			System.out.printf("%2d", i);
			for(int j = 1; j <= ncols; j++){
				System.out.printf("%7d", i*j);
			}
			System.out.println();
			
		}
		
		
		
	}
}
