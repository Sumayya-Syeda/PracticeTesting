/*
ID: sumin07
LANG: JAVA
TASK: gift1
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class gift1 {
	public static void main(String args[]) throws IOException{

		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));  
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
	    //StringTokenizer st = new StringTokenizer(f.readLine());
//	    Scanner st = new Scanner(System.in);
//	    //int np = Integer.parseInt(st.nextLine());
	    
	    int np = Integer.parseInt(f.readLine());
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    String[] names = new String[np];
	    for (int i = 0; i < np; i++){
	    	String name = f.readLine();
	    	map.put(name, 0);
	    	names[i] = name;
	    }
	    int initAmount = 0;
	    int numPeeps = 0;
	    int amountGiven = 0;
	    String test = "";
	    for(int i = 0; i < np ; i++){
	    	//gets who is giving the money
	    	try{
		    	String giver = f.readLine();
		    	//splits the two numbers in the next line. 1st is initial amount, 2nd is num peeeps money is given to
		    	String[] splitArray = f.readLine().split("\\s+");
		    	initAmount = Integer.parseInt(splitArray[0]);
		    	numPeeps = Integer.parseInt(splitArray[1]);
		    	//if there are receivers:
		    	if(numPeeps != 0){
			    	//assign the remainder of the money after distribution the giver and subtract the amount giving away
		    		map.put(giver, (map.get(giver) + initAmount % numPeeps) - initAmount);
			    	//evaluate how much each person gets w/o remainder
			    	amountGiven = initAmount / numPeeps;
			    	//assign the quotient of the money to the next "num" peeps in the input
			    	for(int j = 0; j < numPeeps; j++){
			    		String reciever = "";
			    		
			    		reciever = f.readLine();
			    		map.put(reciever, map.get(reciever) + amountGiven);
			    	}
		    	}
	    	}catch(NoSuchElementException e){
	    		int food = 0;
	    	}
	    }
	    //format the map by name + space + value
	    for(int j = 0; j < names.length; j++){
	    	out.println(names[j] + " " + map.get(names[j]));
	    }
	    out.close();
	}
}
