import java.util.LinkedList;
import javafx.util.Pair;

public class adjacenytlist {
	private LinkedList < Pair<Integer,Integer>>[] adjlist;
	public adjacenytlist(int vertices)
	{
		adjlist = new LinkedList[vertices];
		for(int i=0;i<adjlist.length;i++)
		{
			adjlist[i] = new LinkedList<>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
