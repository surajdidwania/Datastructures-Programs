import java.util.Stack;

public class DFS {
	public static class node
	{	int data;
	boolean visited;
	public  node[] neighbour;
		node(int data){
			this.data=data;
			this.visited=false;
		}
	}
	public static void DFSalgo(node n)
	{
		Stack<node> s = new Stack<node>();
		s.push(n);
		
		while(!s.isEmpty())
		{
			node element = s.pop();
			if(!element.visited)
			{
				System.out.println(element.data);
				element.visited = true;
				for(int i=element.neighbour.length-1;i>=0;i--)
				{
					s.push(element.neighbour[i]);
				}
			}
			
		}
		
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
	
		DFS di = new DFS();
		System.out.println("TheDFS Traversal of the algorithm is");
		di.DFSalgo(node10);
	}

}
