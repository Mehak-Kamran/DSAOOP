package two;
import java.util.Scanner;

public class Fruit {
	public static void main(String args[]) {
		System.out.println("Enter a Fruit: ");
		System.out.println("Options:Apple,Mango,Orange");
		Scanner input=new Scanner(System.in);
		String fruit=input.next();
		//new way 
		switch(fruit) {
		case "Apple"->System.out.println("Keeps a doctor away");
		case "Mango"->System.out.println("King of fruits");
		case "Orange"->System.out.println("Gift of winter");
		default->System.out.println("Enter a valid option");
			
		}
		
		
	}

}
