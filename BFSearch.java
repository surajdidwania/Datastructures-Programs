import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSearch {
	
	public static class node
	{
		int level = 0;
		int distance;
		node prede;
		int data;
		public node[] neighbour;
		node(int data)
		{
			this.data=data;
		}
	}
	 Queue<node> queue = new LinkedList<node>();
	 
	public void BFSAlgo(node s)
	{
		s.level = 1;
		s.distance = 0;
		s.prede = null;
		queue.add(s);
		while(!queue.isEmpty())
		{
			node element = queue.remove();
			//System.out.println(element.data);
			
			for(int i=0;i<element.neighbour.length;i++)
			{
				if(element.neighbour[i].level == 0)
				{
					element.neighbour[i].level = 1;
					element.neighbour[i].distance = element.distance + 1;
					element.neighbour[i].prede = element;
					queue.add(element.neighbour[i]);
				}
			}
			
		}
	}
	public void printdata(node s, node v)
	{
		if(v  == s)
		{
			System.out.println(s.data);
		}
		else if(v.prede == null)
		{
			System.out.println("No path exists from s to v");
		}
		else printdata(s,v.prede);
		System.out.println(v.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node node10 = new node(10);
		node node20 = new node(20);
		node node30 = new node(30);
		node node40 = new node(40);
		node node50 = new node(50);
		node node60 = new node(60);
		node node70 = new node(70);
		node10.neighbour = new node[]{node20,node30,node40};
		node20.neighbour = new node[]{node30};
		node30.neighbour = new node[]{node70};
		node40.neighbour = new node[]{node60,node70};
		node50.neighbour = new node[]{node40,node60};
		node60.neighbour = new node[]{node70};
		node70.neighbour= new node[]{};
		Scanner sc = new Scanner(System.in);
		BFSearch s = new BFSearch();
		s.BFSAlgo(node10);
		s.printdata(node10, node70);
		
	}

}
