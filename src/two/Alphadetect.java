package two;
import java.util.Scanner;

public class Alphadetect {
	public static void main(String args[]) {
		
		System.out.println("Enter a char");
		Scanner input=new Scanner(System.in);
		char ch= input.next().trim().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("LOWER CASE");
		}
		else {
			System.out.println("UPPER CASE");
		}
		
		
		
		
	}

}
