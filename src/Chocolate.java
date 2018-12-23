
/**
 * 
 * @author Sumayya Syeda
 * Period  #2
 *
 */
public class Chocolate {
	private int numSmall;
	private int numBig;
	private int ogBig;
	private int ogSmall;
	/**
	 * Checks if we can make chocolate bars
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false otherwise
	 */
	public boolean canMakeBricks(int small, int big, int goal)
	{
		numSmall = 0;
		numBig = 0;
		ogBig = big;
		ogSmall = small;
		boolean enough = false;
		goal -= 5;
		big--;
		numBig = (goal / 5) + 1;
		if(numBig%5 > big && big > 0) goal-=5;
		else if(goal > 0){
			goal --;
			small--;
			numSmall = (goal % 5) + 1;
		}
		
		System.out.println(numBig + " big out");
		System.out.println(big + " out");
		System.out.println(numSmall + " small out");
		System.out.println(small + " out");
		if(numBig <= ogBig && numSmall <= ogSmall) {
			
			System.out.println(numBig + " big");
			System.out.println(numSmall + " small");
			enough = true;
		}
		System.out.println(enough + " enough");
		return enough;
	}
	/**
	 * Determines number of small bricks needed to make the chocolate bar
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return number of small bricks needed
	 */
	
	public int numberOfSmallBricksNeeded(int small, int big, int goal)
	{
		
		canMakeBricks(small, big, goal);
		if(numSmall > 0) return numSmall;
		return -1;
		
	}


}

/*
 * numberOfSmallBricksNeeded(4, 1, 10) --
 * goal = 5
 * big = 0
 * goal % 5 = 0
 * goal = 4
 * small = 3
 * numSmall = 4
 * numBig <= 0 && numSmall <= 4
 *  
 * 
 * canMakeBricks(3, 1, 8) --> true 
 * goal = 3
 * big = 0
 * goal % 5 = 2
 * goal = 2
 * small = 2
 * numSmall = 3
 * numBig <= 0 && numSmall <= 3
 * 
 * canMakeBricks(3, 2, 10) --> true 
 * goal =  5
 * big = 1
 * numBig =  2
 * goal % 5 = 0
 * 
 * canMakeBricks(4, 1, 9) --> true 
 * goal = 4
 * big = 0
 * numBig = 1
 * goal % 5 = 0 
 * goal = 3
 * numSmall = 4
 * numBig <= 1 && numSmall <= 4
 */

