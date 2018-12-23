import java.util.*;

/**
 * 
 * @author Sumayya Syeda 
 * Period #2
 */

public class Gameland {
	// Declare Random object here
	private Random random;
	private int dice1;
	private int dice2;
	private int player1;
	private int player2;
	private int diceTotal;
	private final int START = 0;
	private final int FINISH = 100;
	
	// Declare other instance variables here

	/**
	 * Method to create a new Random object and initialize with the give seed
	 * 
	 * @param seed
	 *            - seed for the random number generator
	 */
	public Gameland(int seed) {
		// Your code goes here
		random = new Random(seed);

	}

	/**
	 * Method that simulates the roll of two dice
	 */
	public void roll() {
		// Your code goes here
		dice1 = random.nextInt(6) + 1;
		dice2 = random.nextInt(6) + 1;
		diceTotal = dice1 + dice2;

	}

	/** Method that runs the game. For each move
     *  print the roll and the players location after the move
     * 
     */
    public void moving() 
    {
    		int turn = 0;
    		int moveSpaces = 0;
    		player1 = 0;
    		boolean someoneBumped = false;
    		boolean someone7 = false;
    		while(player1 < 100 && player2 < 100) {
    			if(turn % 2 == 0) {//playerA
    				roll();
    				moveSpaces = 0;
    				if(!(diceTotal == 12 || diceTotal == 2)){
    					if(diceTotal == 7){
    						while(moveSpaces < 7) {
    							if(player1 > 0) player1--;
    							moveSpaces++;
    						}
    						someone7 = true;
    						System.out.println("Player A rolled a " + diceTotal + " >>> ******* Player A is now at " + player1);
    						
    					}else{
    						for(moveSpaces = 1; moveSpaces <= diceTotal; moveSpaces++){
    							player1++;
    						}
    						if(player1 == player2 && player1 != 0 && player2 != 0) {
    							player2 = 0;
    							someoneBumped = true;
    							System.out.println("Player A rolled a " + diceTotal + " >>> - BUMPED - Player A is now at " + player1);
    						}
    						
    					}
    					if(player1 < 100 && !someoneBumped && !someone7) {
							System.out.println("Player A rolled a " + diceTotal + " >>> Player A is now at " + player1);
						}
						else if(player1 >= 100 && !someoneBumped && !someone7) {
							System.out.println("Player A rolled a " + diceTotal + " >>> Player A WINS!!");
						}
    					
    					
    				}else System.out.println("Player A rolled a " + diceTotal + " >>> ** Player A is now at " + player1);
    				
    			}else{//player B
    				roll();
    				moveSpaces = 0;
    				if(!(diceTotal == 12 || diceTotal == 2)){
    					if(diceTotal == 7){
    						while(moveSpaces < 7) {
    							if(player2 > 0) player2--;
    							moveSpaces++;
    						}
    						someone7 = true;
    						System.out.println("Player B rolled a " + diceTotal + " >>> ******* Player B is now at " + player2);
    						
    					}else{
    						for(moveSpaces = 1; moveSpaces <= diceTotal; moveSpaces++){
    							player2++;
    						}
    						if(player2 == player1 && player1 != 0 && player2 != 0) {
						      player1 = 0;
						      someoneBumped = true;
					      	System.out.println("Player B rolled a " + diceTotal + " >>> - BUMPED - Player B is now at " + player2);
    						}
    						 
    						
    					}
    					if(player2 < 100 && !someoneBumped && !someone7) {
							System.out.println("Player B rolled a " + diceTotal + " >>> Player B is now at " + player2);
    					}else if(player2 >= 100 && !someoneBumped && !someone7){
    						System.out.println("Player B rolled a " + diceTotal + " >>> Player B WINS!!");
    					}
    					
    						
    					
    				}else System.out.println("Player B rolled a " + diceTotal + " >>> ** Player B is now at " + player2);
    			}
	    	 	diceTotal = 0;
	    	 	turn++;
	    	 	if(someoneBumped) someoneBumped = false;
	    	 	if(someone7) someone7 = false;
    		}
    	    System.out.println("Player A is now at " + player1);
    	    System.out.println("Player B is now at " + player2);
    	


    }

}




