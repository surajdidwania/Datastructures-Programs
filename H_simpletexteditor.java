import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class H_simpletexteditor {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Stack<String> stk = new Stack<String>();
		//stk.push(S);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<k;i++)
		{
			int type = sc.nextInt();
			
			//.put(type, val);
			if(type==1){
				 String S=sc.nextLine();
				stk.push(S);
				sb.append(S);
				System.out.println(S);
			}
			else if(type==2)
			{
				String sub=stk.peek().substring(0, sb.length()-sc.nextInt());
				stk.push(sub);
			}
			else if(type==3)
			{
				System.out.println(sb.charAt(sc.nextInt()-1)); 
        	}
			else{
				stk.pop();
				sb=stk.peek();
				}
		}
	}
}
