import java.util.Arrays;

public class queues {
	private String[] queuearray;
	private int queuesize;
	private int front,rear,numberofitems=0;
	String s="sda";
	
	queues(int size)
	{
		queuesize=size;
		queuearray = new String[queuesize];
		Arrays.fill(queuearray,"-1");
	}
	public void insert(String input)
	{
		if(numberofitems + 1 <= queuesize)
		{
			queuearray[rear]=input;
			rear++;
			numberofitems++;
			System.out.println("insert done");
		}
		else System.out.println("queue full");
	}
	public void remove()
	{
		if(numberofitems > 0)
		{
			System.out.println("remove done");
			queuearray[front] = "-1";
			front++;
			numberofitems--;
		
		}
		else System.out.println("queuie empty");
	}
	public static void main(String args[])
	{
		queues q = new queues(10);
		q.insert("10");
		q.insert("20");
		q.insert("30");
		q.remove();
	}
}
