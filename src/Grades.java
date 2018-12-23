import java.util.*;
/**
 * 
 * @author Sumayya Syeda	
 * Period #2
 * 
 */

public class Grades {
	//Declare instance variables here
	private double sumGrades;
	private double gpa;
	private int numClasses;
	private boolean fail;


	/**
	 * Method to get the grades and calculate the GPA
	 * This method also counts the number of classes taken
	 * and the number of Fs
	 */
	public void getGradesAndCalculateGPA()
	{
		//Your code goes here
		String grade = "";
		int numClasses = 0;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			if(scan.next() != " "){
				grade = scan.next();
				if(grade.equals("A")) sumGrades += 4;
				else if(grade.equals("B")) sumGrades += 3;
				else if(grade.equals("C")) sumGrades += 2;
				else if(grade.equals("D")) sumGrades += 1;
				else if(grade.equals("F")) {
					sumGrades += 0;
					fail = true;
				}
				numClasses++;
			}
		}
		gpa = sumGrades/numClasses;
		
		
	}
	/**
	 * Method to print the appropriate message
	 */
	public void printMessage()
	{
		if(!fail && gpa >= 2.0 && numClasses >= 4) System.out.println("Eligible");
		else if(numClasses <= 4) System.out.println("Ineligible, taking less than 4 classes");
		else if(gpa < 2.0) System.out.println("Ineligible, gpa below 2.0");
		else if(fail && gpa >= 2.0) System.out.println("Ineligible, gpa above 2.0 but has F grade");
		else if(fail && gpa < 2.0) System.out.println("Ineligible, gpa below 2.0 and has F grade");



	}

}