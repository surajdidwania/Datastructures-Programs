import java.util.Scanner;
import java.util.Stack;

public class preorderbst {
	static Stack<Integer> stk;
	private static boolean preorder(int[] input, int n) {
		// TODO Auto-generated method stub
		stk = new Stack<Integer>();
		int root = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(input[i]<root)
			{
				return false;
			}
			while(!stk.isEmpty() && stk.peek() < input[i])
			{
				root = stk.peek();
				stk.pop();
			}
			stk.push(input[i]);
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the no");
		int[] input = new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
		}
		if(preorder(input,n)) System.out.println("true"); else
			System.out.println("False");
		sc.close();
	}

	

}
