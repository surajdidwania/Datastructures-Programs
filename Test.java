
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) throws Exception{
		
		   System.out.println("Enter your username: ");
		   Scanner scanner = new Scanner(System.in);
		   String username = scanner.nextLine();
		   int num = Integer.parseInt(username);
		   System.out.println("Your Count is " + num);
		   
		   for(int i=num; i>0; i--)
		   {
			   
				   int nh = num - (i-1);
				   int ns = num - nh;
				   String msg = "";
				   while(ns>0)
				   {
					   msg = msg + " ";
					   ns--;
				   }
				   while(nh>0)
				   {
					   msg = msg + "#";
					   nh--;
				   }
				   System.out.println(msg);
		   }
	}
}
