//To calculate Fibonacci Series up to n numbers.
package two;
import java.util.Scanner;

public class Factorial {
public static void main(String args[]) {
	System.out.println("Enter a integer:");
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int z=1;
	for(int i=1;i<=n;i++) {
		int a=1;
		a=i*a;
		z=a*z;
		System.out.println(z);
	
		
	}
	System.out.println("Factorial is :"+z);
}
}
