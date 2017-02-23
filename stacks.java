import java.util.Arrays;

public class stacks {
	
	private String[] stackarray;
	private int stacksize;
	private int topofstack = -1;
	
	stacks(int size)
	{
		stacksize = size;
		stackarray = new String[size];
		Arrays.fill(stackarray,"-1");
		
	}
	public void push(String input)
	{
		if(topofstack + 1 < stacksize)
		{
			topofstack++;
			stackarray[topofstack] = input;
		}else System.out.println("the stack is full");
		display();
		System.out.println("push" + input + "was added to the stack");
		
	}
	
	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<stackarray.length;i++)
			System.out.println(stackarray[i]);
	}
	public String pop()
	{
		if(topofstack >= 0)
		{
			display();
			System.out.println("pop" + stackarray[topofstack] + "was removed from the stack");
			stackarray[topofstack]="-1";
			return stackarray[topofstack--];
			
		}else
		{
			display();
			System.out.println("sorry the stack is empty");
			return "-1";
		}
	}
	public String peek()
	{
		display();
		System.out.println("peek" + stackarray[topofstack] + "is at the top of the stack");
		return stackarray[topofstack];
	}
	public void pushmany(String multivalues)
	{
		String tmpstring[] = multivalues.split(" ");
		for(int i=0;i<tmpstring.length;i++)
		{
			push(tmpstring[i]);
		}
	}
	public void popall()
	{
		for(int i=topofstack;i>=0;i--)
			pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacks thestack = new stacks(10);
		thestack.push("100");
		thestack.push("50");
		thestack.peek();
		thestack.pushmany("100 255 259 894");
		thestack.popall();
	}

}
