package two;
import java.util.Scanner;

public class Armstrong_No {
	public static void main(String args[]) {
		System.out.println("Enter three digit no");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		int temp=0;
		int var=0;
		int res=0;
		int no1=no;
		int no2=no;
		int count=0;
		
		while(no2>0) {
		temp=no2%10;
			no2=no2/10;
			count++;
			}
		
		
		while(true) {
			temp=no%10;
			var=(int)(Math.pow(temp,count));
			res=var+res;
			no=no/10;
			
			if(no==0) {
			if(res==no1) {
				System.out.println("Number is Armstrong");
				break;
			}
			else {
				System.out.println("Number is not Armstrong");
				break;
			}
			}
			
		}
		
	}

}
