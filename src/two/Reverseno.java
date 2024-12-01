package two;
import java.util.Scanner;

public class Reverseno {
	public static void main(String args[]) {
		System.out.print("Enter a number: ");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		
		int temp=0;
		int var=0;
		
		while(no>0) {
		temp=no%10;
		var=var*10+temp;
		no=no/10;
		
		}
		System.out.println(var);
	}

}
