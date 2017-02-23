import java.util.Scanner;
import java.util.Stack;

public class duplipara {
	private static void duplicate(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		Stack stk= new Stack();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==')')
			{
			char top = (char) stk.peek();
			stk.pop();
			 if(top=='(') System.out.println("duplicate paranthesis");
			 else{
				while((char)stk.peek()!='(') 
				{
					top = (char) stk.peek();
					stk.pop();
				}
				
				}
			}
			stk.push(str.charAt(i));
			}	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		duplicate(str);
	}

	

}
