import java.util.Scanner;
import java.util.Stack;

public class RPN {
	public int evalRPN(String[] a) {
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=0;i<a.length;i++)
		{
			switch(a[i])
			{
			case "+" : 
				stk.push(stk.pop()+stk.pop());
				break;
			case "*" : 
				stk.push(stk.pop()*stk.pop());
				break;
			case "/" : 
				try{
				int n1= stk.pop(); int n2 = stk.pop();
				stk.push(n1/n2);
				}catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
				break;
			case "-" : 
				stk.push(stk.pop()-stk.pop());
				break;
				
			default:
				stk.push(Integer.parseInt(a[i]));
			}
			
		}
		return stk.pop();
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tokens= new String[5];
		for(int i=0;i<5;i++)
		{
		tokens[i]=sc.next();
		}
		RPN rpn = new RPN();
		int num=rpn.evalRPN(tokens);
		System.out.println(num);
		
	}
}