package two;
import java.util.Scanner;
public class Temp {
	public static void main(String args[]) {
		
		System.out.println("Farenheit to Celcius Converter");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter tempreture to convert: ");
		
		float temp=input.nextFloat();
		//(9/5)+32
		float ftemp=(temp*9/5)+32;
		System.out.println("Tempreture in Farenheit is"+" "+ ftemp);
	}

}
