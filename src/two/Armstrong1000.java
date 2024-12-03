package two;
import java.util.Scanner;

public class Armstrong1000 {
public static void main(String args[]) {
	System.out.println("1000 Armstrong Numbers are:");
	for(int i=1;i<=1000;i++) {
		int swap=i;
		int temp=0;
		int var=0;
		int res=0;
		while(swap>0) {
		temp=swap%10;
		var=temp*temp*temp;
		res=res+var;
		swap=swap/10;
		}
		if(i==res) {
		System.out.println(i);
		}
	}
}
}
