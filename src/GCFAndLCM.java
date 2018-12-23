import java.util.Scanner;

public class GCFAndLCM {
	private int num1;
	private int num2;
	
	public GCFAndLCM(){
//		Scanner stdin = new Scanner(System.in);
//		num1= stdin.nextInt();
//		num2 = stdin.nextInt();
	}

	public int GCF(int a, int b) {
		while (a != b) {
			if (a > b) a = a - b;
			else b = b - a;
		}
		return a;

	}
	public int LCM(int a, int b) {
		int gcf = 2;
		int lcm = 1;
		while(gcf > 1 ) {
			gcf = GCF(a, b);
			lcm *= gcf;
			a = a/gcf;
			b = b/gcf;
			if(a == a/gcf) lcm *= a;
			if(b == b/gcf) lcm *= b;
		}
		return lcm;
	}
}

