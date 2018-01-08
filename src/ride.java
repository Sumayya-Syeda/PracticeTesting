/*
ID: sumin07
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

public class ride {
	public static void main(String args[]) throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));  
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	   
	  
	    String line1 = f.readLine();
	    String line2 = f.readLine();
		
//		Scanner sc = new Scanner(System.in);
//		String line1 = sc.nextLine();
//		String line2 = sc.nextLine();
		
	    int product1 = (int)(line1.charAt(0)) - 64;
	    String str = "";
	    for(int i = 1; i < line1.length(); i++){
	    	product1 *= (int)(line1.charAt(i)) - 64;
	    }
	    int product2 = (int)(line2.charAt(0)) - 64;
	    for(int i = 1; i < line2.length(); i++){
	    	product2 *=(int)(line2.charAt(i)) - 64;
	    }
	    
	    if(product1 % 47 == product2 % 47) str = "GO";
	    else str = "STAY";
	    out.println(str);                          
	    out.close(); 
	    
	}
}
