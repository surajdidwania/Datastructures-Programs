import java.util.Scanner;
import java.util.Stack;

public class bktreversal {
	private static int bktrev(String str) {
		// TODO Auto-generated method stub
		int len = str.length();
		Stack stk  =new Stack();
		if(len%2!=0) return -1;
		for(int i=0;i<len;i++)
		{
			if(!stk.isEmpty() && str.charAt(i)=='}')
			{
				if((char)stk.peek()=='{')
				stk.pop();
				else
					stk.push(str.charAt(i));
			}
			else
				stk.push(str.charAt(i));
		}
		int len1 = stk.size();
		int n=0;
		while(!stk.isEmpty() && (char)stk.peek()=='{')
		{
			stk.pop();
			n++;
		}
		return (len1/2 + n%2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(bktrev(str));
	}

	

}
