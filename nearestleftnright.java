	import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class nearestleftnright {
	private static void nearestleft(int[] input, int n, int[] nl, char c) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			while(!stk.isEmpty() && stk.peek()>=input[i])
					{
						stk.pop();
					}
			if(stk.isEmpty())
			{
				nl[i]=0;
			}
			else
				nl[i]=stk.peek();
			stk.push(input[i]);
		}
	}
	private static void maxdiff(int[] input, int n) {
		// TODO Auto-generated method stub
		int[] nl = new int[n];
		int[] nr = new int[n];
		nearestleft(input,n,nl,'l');
		Collections.reverse(Arrays.asList(input));
		/*int left = 0;
		int right=n-1;
		int temp;
		while(left<right)
		{
			temp = input[right];
			input[right] = input[left];
			input[left] = temp;
			
			left++;
			right--;
		}*/
		nearestleft(input,n,nr,'r');
		int result=-1;
		for(int i=0;i<n;i++)
		{
			System.out.println(Math.abs(nl[i]-nr[n-1-i]));
			result = Math.max(result,Math.abs(nl[i]-nr[n-1-i]));
		}
		System.out.println(result);
	}

		

		public static void main(String args[])
		{
			Scanner sc  = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("Enter the no");
			int[] input = new int[n];
			for(int i=0;i<n;i++)
			{
				input[i]=sc.nextInt();
			}
			maxdiff(input,n);
		}

		}
