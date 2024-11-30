//To calculate Fibonacci Series up to n numbers.
package two;
import java.util.Scanner;

public class Fibbonacci {
	public static void main(String args[]) {
		System.out.println("Fibonnaci Series");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		float no=(int)(input.nextFloat());
		//since i know how many times i have to run the loop
		//so i will use for
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<no;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;		
		}
	}
}
