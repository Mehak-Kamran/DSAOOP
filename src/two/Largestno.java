//Take 3 numbers as input and print the largest number.
package two;
import java.util.Scanner;

public class Largestno {
	public static void main(String args[]) {
		System.out.print("Enter three nos: ");
		Scanner input=new Scanner(System.in);
		float no1=(int)(input.nextFloat());
		float no2=(int)(input.nextFloat());
		float no3=(int)(input.nextFloat());
		
		int max=(int)(no1);
		
		if(max<no2) {
			
			max=(int)(no2);
			
		}
		if(max<no3) {
			
			max=(int)(no1);
			
		}
		
		System.out.println("Maximum no is:" +" " +max);
		
		
	}

}
