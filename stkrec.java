import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stkrec {
	
	private static void sortstack(Stack stk) {
		// TODO Auto-generated method stub
		int no = (int) stk.pop();
		while(stk.size()!=1)
		{
			sortstack(stk);
		}
		insertno(stk,no);
				
	}
	private static void insertno(Stack stk, int no) {
		// TODO Auto-generated method stub
		if(stk.isEmpty())
		{
			stk.push(no);
		}
		else if((int)stk.peek() < no)
		{
			stk.push(no);
		}
		else
		{
			int newpopeno = (int) stk.pop();
			insertno(stk,no);
			stk.push(newpopeno);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> stk = new Stack<Integer>();
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the no");
		int[] input = new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
			stk.push(input[i]);
		}
		sortstack(stk);
		System.out.println(Arrays.toString(stk.toArray()));

	}
	

}
