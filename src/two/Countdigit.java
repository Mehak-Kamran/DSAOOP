package two;
import java.util.Scanner;

public class Countdigit {
	public static void main(String args[]) {
		System.out.println("Enter digit");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		int count=0;
		while(no>0) {
			int temp=no%10;
			no=no/10;
			count++;
			
			
		
			
			}
		System.out.println(count);
		
			
		}
		
	}


