import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsMST {

	private LinkedList<Integer> list[];
	private int V;
	PriorityQueue<Entry> q = new PriorityQueue<>();
	public  class Entry implements Comparable<Entry>{
		private String key;
		private int value;
		public Entry(String key,int value)
		{
			this.key = key;
			this.value = value;
		}
		public int compareTo(Entry o)
		{
			return this.getKey(compareTo(o.getKey()));
		}
	}
	public  void assign() 
	{
	q.add(new Entry(String.get(x), calculateStringValue(String.get(x))));
	}
	PrimsMST(int v)
	{
		V= v;
		list = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			list[i]=new LinkedList();
		}
	}
	void addedge(int v, int w)
	{
		list[v].add(w);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimsMST g = new PrimsMST(4);
		g.addedge(0,1);
		g.addedge(0,7);
		g.addedge(1,2);
		g.addedge(1,7);
		g.addedge(2,8);
		g.addedge(2,3);
		g.addedge(2,5);
		g.addedge(3,4);
		g.addedge(3,5);
		g.addedge(4,5);
		g.addedge(5,6);
		g.addedge(6,8);
		g.addedge(6,7);
		g.addedge(7,8);
		
	}

}
