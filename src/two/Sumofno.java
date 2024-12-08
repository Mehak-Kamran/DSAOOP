//Sum Of A Digits Of Number
package two;
import java.util.Scanner;

public class Sumofno {
public static void main(String args[]) {
	 System.out.println("Enter an integer");
	 Scanner input=new Scanner(System.in);
	 int no=input.nextInt();
	 int temp=0;
	 int res=0;
	 while(no>0) {
		 temp=no%10;
		 res=temp+res;
		 no=no/10;
	 }
	 System.out.println(res);
}
}
