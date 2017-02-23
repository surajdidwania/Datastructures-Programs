import java.awt.List;
import java.util.Iterator;
import java.util.Scanner;


public class shortpath {
	public class Node {
		  List neighbors;
		  Node pathParent;
		  int data;
		  Node(int data)
		  {
			  this.data=data;
		  }
		}
	protected List constructPath(Node node) {
		  LinkedList path = new LinkedList();
		  while (node.pathParent != null) {
		    path.addfirst(node);
		    node = node.pathParent;
		  }
		  return path;
		}
	public List search(Node startNode, Node goalNode) {
		  // list of visited nodes
		  LinkedList closedList = new LinkedList();
		  
		  // list of nodes to visit (sorted)
		  LinkedList openList = new LinkedList();
		  openList.add(startNode);
		  startNode.pathParent = null;
		  
		  while (!openList.isEmpty()) {
		    Node node = (Node)openList.removeFirst();
		    if (node == goalNode) {
		      // path found!
		      return constructPath(goalNode);
		    }
		    else {
		      closedList.add(node);
		      
		      // add neighbors to the open list
		      Iterator i = node.neighbors.iterator();
		      while (i.hasNext()) {
		        Node neighborNode = (Node)i.next();
		        if (!closedList.contains(neighborNode) &&
		          !openList.contains(neighborNode)) 
		        {
		          neighborNode.pathParent = node;
		          openList.add(neighborNode);
		        }
		      }
		    }
		  }
		  
		  // no path found
		  return null;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node40 = new Node(40);
		Node node50 = new Node(50);
		Node node60 = new Node(60);
		Node node70 = new Node(70);
		
		ShortestPath sp = new ShortestPath();
		System.out.println("Please enter the source");
		int s = sc.nextInt();
		System.out.println("Please enter the Destination");
		int finish = sc.nextInt();
		Node s1 = new Node(s);
		Node finish1 = new Node(finish);
		sp.search(s1,finish1);
		
	}

}
