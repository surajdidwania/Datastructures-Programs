import java.util.Scanner;
import java.util.Stack;

public class lenlongest {
	private static int bktrev(String str) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(!stk.isEmpty() && str.charAt(i)==')')
			{
				if((char)stk.peek()=='(')
				{
					stk.pop();
					count+=2;
				}
				/*else
					stk.push(str.charAt(i));*/
			}
			else
			stk.push(str.charAt(i));
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(bktrev(str));
		
	}

	

}
