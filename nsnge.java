import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class nsnge {
	 
		public static void greaterno(int[] input, int n, int[] store,char s)
		{
			Stack<Integer> stk= new Stack<Integer>();
			for(int i=n-1;i>=0;i--)
			{
				while(!stk.isEmpty() && ((s=='g')?input[stk.peek()]<=input[i]:input[stk.peek()]>=input[i]))
				{
					stk.pop();
				}
				if(!stk.isEmpty())
				store[i]=stk.peek();		
				else
					store[i]=-1;
				stk.push(i);
			}
			
		}
		private static void nextsmallgreatno(int[] input, int length) {
			// TODO Auto-generated method stub
			int[] ng = new int[7];
			int[] rs = new int[7];
			greaterno(input,length,ng,'g');
			greaterno(input,length,rs,'s');
			for(int i=0;i<length;i++)
			{
				if(ng[i]!=-1 && rs[ng[i]]!=-1)
				{
					System.out.println(rs[ng[i]]);
				}
				else
				{
					System.out.println("-1");
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[7];
		for(int i=0;i<7;i++)
		{
			input[i]=sc.nextInt();
		}
		nextsmallgreatno(input,input.length);
	}
	

}
