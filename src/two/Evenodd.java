/*Write a program to print whether a number is even or odd, 
also take input from the user.*/
package two;
import java.util.Scanner;

public class Evenodd {
	public static void main(String args[]) {
		System.out.println("Enter a Number: ");
		Scanner input =new Scanner(System.in) ;
		int userno=(int)(input.nextFloat());
		userno=(int)(userno);
		if(userno%2==0) {
			System.out.println("No is Even");
		}
		else {
			System.out.println("No is odd");
		}
		
	}
	

}
