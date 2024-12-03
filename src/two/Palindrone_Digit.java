package two;
import java.util.Scanner;

public class Palindrone_Digit {
public static void main(String args[]) {
	System.out.println("Enter a interger");
	Scanner input=new Scanner(System.in);
	int no=input.nextInt();
	int swap=no;
	int var=0;
	int temp=0;
	while(swap>0) {
		
		temp=swap%10;
		var=var*10+temp;
		swap=swap/10;
		
	}
	if(var==no) {
		System.out.println("Palindrone");
	}
	else {
		System.out.println("No is not Palindrone");
	}
	
}
}
