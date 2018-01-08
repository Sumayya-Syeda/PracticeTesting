/*
ID: sumin07
LANG: JAVA
TASK: friday
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class friday {
	static int[] weekdays = new int[7];
	static int lastDay = 0;
	public static void main(String args[]) throws IOException{

		BufferedReader f = new BufferedReader(new FileReader("friday.in"));  
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		Arrays.fill(weekdays, 0);
	    int numYears = Integer.parseInt(f.readLine());
	    for (int i  = 0; i < numYears; i++){
	    	for(int j = 1; j <= 12; j++){
	    		if(j == 2 || j == 4 || j == 6 || j == 11 || j == 9){
	    			if(j == 2){
	    				int year = i + 1900;
	    				if (year != 1900 && year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))){
	    					findThirteenthWeekday(29);
	    				}else 
	    					findThirteenthWeekday(28);
	    			}else{
	    				findThirteenthWeekday(30);
	    			}
	    		}else{
	    			findThirteenthWeekday(31);
	    		}
	    	}
		}
	
	    out.print(weekdays[6] + " ");
	    for(int m = 0; m < weekdays.length-2; m++){
	    	out.print(weekdays[m] + " ");
	    }
	    out.println(weekdays[5]);
	    out.close();
	}
	public static void findThirteenthWeekday(int m){
		for (int d = 0; d <= m; d++){
			if(d == 13){
				int weekday = (d + lastDay) % 7;
				weekdays[weekday] += 1;
			}
		}
		lastDay = (m + lastDay) % 7;
	}
}
