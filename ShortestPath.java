import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class ShortestPath {
	static Queue<node> q = new LinkedList<node>();
	int item;
	public static class node
	{
		boolean visited;
		int data;
		public node[] neighbour;
		Double distance;
		String path;
		node(int data)
		{
			this.data=data;
			this.visited=false;
			this.distance=Double.POSITIVE_INFINITY;
		}
	}
	
	public static void shortestpath(node s, node finish)
	{
		s.distance=0.0;
		node item = s;
		q.add(s);
		while(!q.isEmpty())	
		{
			 item = q.remove();
			for(int i=item.neighbour.length-1;i>=0;i--)
			{
				node nextnode = item.neighbour[i];
				if(nextnode.distance == Double.POSITIVE_INFINITY )
				{
					nextnode.distance = item.distance + 1;
					nextnode.path = item.path;
					q.add(nextnode);
				}
			}
		}
		if (!item.equals(finish)){
	        System.out.println("can't reach destination");
	    }
		System.out.println(item.path);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		node node10 = new node(10);
		node node20 = new node(20);
		node node30 = new node(30);
		node node40 = new node(40);
		node node50 = new node(50);
		node node60 = new node(60);
		node node70 = new node(70);
		node10.neighbour = new node[]{node20,node30,node40};
		node20.neighbour = new node[]{node10,node30};
		node30.neighbour = new node[]{node10,node20,node70,node60};
		node40.neighbour = new node[]{node10,node60,node70};
		node50.neighbour = new node[]{node20,node60};
		node60.neighbour = new node[]{node40,node50,node70,node30};
		node70.neighbour= new node[]{node30,node40,node60};
		ShortestPath sp = new ShortestPath();
		System.out.println("Please enter the source");
		int s = sc.nextInt();
		System.out.println("Please enter the Destination");
		int finish = sc.nextInt();
		node s1 = new node(s);
		node finish1 = new node(finish);
		sp.shortestpath(s1,finish1);
		
	}

}
