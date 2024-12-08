//Perfect Number In Java
package two;
import java.util.Scanner;

public class Perfectno {
	public static void main(String args[]) {
		System.out.println("Enter a no");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		int sum=0;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
			  sum=i+sum;
			  
			}
		 
		}
		if(sum==no) {
			 System.out.println("Perfect no");
		 }
		 else {
			 System.out.println("Not a perfect no");
		 }
		
		
	}

}
