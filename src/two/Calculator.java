package two;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		
		while(true) {
			System.out.println("Enter two number: ");
			Scanner input=new Scanner(System.in);
			int no1=input.nextInt();
			int no2=input.nextInt();
			System.out.println("Options:(+,-,/,*,%,x(to exit) Enter Operation:");
			char op=input.next().trim().charAt(0);
			int res;
			if(op=='+') {
				res=no1+no2;
				System.out.println(res);
			}
			else if(op=='-') {
				res=no1-no2;
				System.out.println(res);
			}else if(op=='*') {
				res=no1*no2;
				System.out.println(res);
			}else if(op=='/') {
				res=no1/no2;
				System.out.println(res);
			}else if(op=='%') {
				res=no1%no2;
				System.out.println(res);
			}else if(op=='x'|| op=='X') {
				System.out.println("Exiting.....");
				System.out.println("Exited");
				break;
			}else {
				System.out.println("Please select a valid option");
			}
			
		}
		
		
		
		
	}
}
