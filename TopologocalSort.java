import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import javax.awt.*;

public class TopologocalSort {
	private int V;
	private LinkedList<Pair<Integer,Integer>> list[];

	boolean[] visited=new boolean[V];
	public int time;
	public class node
	{
		int level=0,data;
		node prede = null;
		int start;
		int finish;
		node(int data)
		{
			this.data=data;
		}
		
	}
	TopologocalSort(int v)
	{
		V = v;
		list = new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			list[i]=new LinkedList();
		}
	}
	void addedge(int v, node w)
	{
		list[v].add(w);
	}
	public void ts()
	{
		 time=0;
		for(int i=0;i<V;i++)
		{
			if(!visited[i])
				DFSvisit(list[i]);
				
		}
	}
	
	public void DFSvisit(LinkedList<node> list)
	{
		
		time=time+1;
		list[i].start=time;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TopologocalSort g = new TopologocalSort(4);
		
		g.addedge(0,1);
		g.addedge(0,2);
		g.addedge(1,2);
		g.addedge(2,0);
		g.addedge(2,3);
		g.addedge(3,3);
		
	}

}
