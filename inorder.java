import java.util.ArrayList;
import java.util.List;

public class inorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {1,2,3};
		List<BinaryTree> generatetest = getalltrees(preorder,0,preorder.length-1);
		for(BinaryTree eachformed: generatetest)
		{
			eachformed.printinorder();
		}
	}
	static List<BinaryTree> getalltrees(int[] preorder,int start, int end)
	{
		List<BinaryTree> returntree = new ArrayList<BinaryTree>();
		
		if(start<end || start<0|| end>=preorder.length)
		{
			returntree.add(null);
			return returntree;
		}
		if(start==end)
		{
			returntree.add(new BinaryTree(preorder[start]));
			return returntree;
		}
		for(int i=-1;i<end-start;i++)
		{
			List<BinaryTree> leftchildren = getalltrees(preorder,start+1,start+1+i);
			List<BinaryTree> rightchildren = getalltrees(preorder,start+2+i,end);
			for(BinaryTree eachleft:leftchildren )
			{
				for(BinaryTree eachright: rightchildren)
				{
					BinaryTree tmproot = new BinaryTree(preorder[start]);
					tmproot.left = eachleft;
					tmproot.right = eachright;
					returntree.add(tmproot);
				}
			}
		}
		return returntree;
	}
}
	class BinaryTree
	{
		int value;
		BinaryTree left;
		BinaryTree right;
		BinaryTree(int value)
		{
			this.value = value;
			
		}
		public void printinorder()
		{
			inordertraversal(this);
			System.out.println();
		}
		private void inordertraversal(BinaryTree node)
		{
			if(node==null) return;
			inordertraversal(node.left);
			System.out.println(node.value);
			inordertraversal(node.right);
		}
	}


