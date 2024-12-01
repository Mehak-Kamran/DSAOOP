package two;
import java.util.Scanner;
public class Occurenceofno {
   public static void main(String args[]) {
	   System.out.print("Enter a no");
	   Scanner input=new Scanner(System.in);
	   int var=input.nextInt();
	   System.out.print("Enter a no to search count");
	   int search=input.nextInt();   
	 /*since i dont know how long the loop may run,
	  bc i'm taking input from user so i will use while loop
	  */
	   int temp=0;
	   int max=0;
	   while(var>0) {
		   temp=var%10;
		   if(search==temp) {
			   max+=1;
		   }
		   
		   var=var/10;
	   }
	   System.out.println(max);
	   
	   
   }
	
}
