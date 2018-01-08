import java.io.IOException;
import java.util.Scanner;

public class beads {
	public static void main (String args[]) throws IOException{
		Scanner st = new Scanner(System.in);
		
		//int numBeads = st.nextInt();
		String necklace = st.nextLine();
		int count = 0;
		int largestCount = 0;
		for(int i = 0; i < necklace.length(); i++){
//			for(int j = i; j < necklace.length(); j++){
//				if (j < necklace.length() && j+1 < necklace.length() && (necklace.charAt(j) == necklace.charAt(j+1) || necklace.charAt(j+1) == 'w')){
//					count++;
//				}else if(necklace.charAt(j) == 'w') count++;
//				else break;
//				
//				
//			}
			//System.out.println(count + " after this letter");
//			for(int j = i; j >= 0; j--){
//				if (j >= 0 && j-1 >= 0 && j - 2 >= 0 && (necklace.charAt(j-1) == necklace.charAt(j-2) || necklace.charAt(j-1) == 'w')){
//					count++;
//				}else if(necklace.charAt(j) == 'w') count++;
//				else break;
//			}
			int tLetter = necklace.charAt(i);
			if (tLetter == 'w'){
				int j = i;
				while(necklace.charAt(j) == 'w'){
					count++;
					j++;
				}
				tLetter = necklace.charAt(j);
			}
			for(int j = i; j < necklace.length(); j++){
				if(j + 1 < necklace.length() && (necklace.charAt(j+1) == tLetter || necklace.charAt(j+1) == 'w')){
					count++;
				} else break;
			}
			if (count > largestCount) largestCount = count;
			
			
			
			count = 0;
			
		}
		System.out.println(largestCount);
		
	}
}


/*
plan:

for each letter, 
	- count++ from that letter to next letter until letter is different
		- keep checking until letter before
	- count++ from that letter to letter before until letter is different
		- keep checking until letter af
	
*/