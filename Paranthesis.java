import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
		String str = "((a+b)+(c+d))";
		Stack stk = new Stack();
		int flag=0;
		for(int i=0;i<str.length();i++)
			
		{
			if(str.charAt(i) == ')')
			{
				char top = (char) stk.peek();
				stk.pop();
			if(top == '(')
			{
				flag=1;
			}
			else{
				while(top!='(')
				{
					top = (char) stk.peek();
					stk.pop();
				}
			}
		}
			else stk.push(str.charAt(i));
	}
	if(flag == 0)
		System.out.println("Duplicate not found");
	else
		System.out.println("Duplicate present");
	
	}
}
