import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class BFSALgo 
{ 
	private Queue<Integer> list; //Queue
	int item,seq,i;
	public BFSALgo()  //Constructor
	{
		list = new LinkedList<Integer>();
	}
	public void bfsitem(int adjmatrix[][],int source)
	{
		int noofnodes = adjmatrix[source].length-1;
		int[] visit = new int[noofnodes+1];
		visit[source]=1;
		list.add(source);			//ENQUEUE
		while(!list.isEmpty())
		{
			item = list.remove();    //DEQUEUE
			i= item;
			System.out.println(i);
			while(i<=noofnodes)
			{
				if(adjmatrix[item][i]==1 && visit[i] == 0)
				{
					list.add(i);
					visit[i] = 1;
				}
				i++;
			}
		}
	
	}
    public static void main(String[] args)
    {
    	BFSALgo bi = new BFSALgo();
    	Scanner sc = new Scanner(System.in);
    	int numnodes;
    		System.out.println("Please print the no of nodes");
    		 numnodes = sc.nextInt();
    		int adjmatrix[][] = new int[numnodes+1][numnodes+1]; //Adjacency Matrix
    		for(int i=1;i<=numnodes;i++)
    			for(int j=1;j<=numnodes;j++)
    			adjmatrix[i][j]=sc.nextInt();
    		System.out.println("Please enter the source for the implementation");
    		int source = sc.nextInt();
    		System.out.println("The BFS algorithm implemented as");		
    		bi.bfsitem(adjmatrix,source);
    	sc.close();
    	
    } 
}