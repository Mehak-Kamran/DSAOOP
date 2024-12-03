package two;
import java.util.Scanner;

public class Weekdays {
	public static void main(String args[]) {
		System.out.println("Enter a no: ");
		System.out.println("Options:1-7");
		Scanner input=new Scanner(System.in);
		int weekno=input.nextInt();
		//old way 
		switch(weekno) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid option");
			
		}
		
		
	}

}
