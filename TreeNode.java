import java.util.Stack;


 
  public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

public class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stk;
    public BSTIterator(TreeNode root) {
    	stk = new Stack<TreeNode>();
    	TreeNode cur = root;
    	while(cur!=null)
    	{
    		stk.push(cur);
    		if(cur.left!=null)
    		{
    			cur = cur.left;
    		}
    		else break;
    	}
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       return (!stk.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        
       TreeNode node = stk.pop();
       TreeNode cur = node;
       if(cur.right!=null)
       {
    	   cur = cur.right;
    	   while(cur!=null)
    	   {
    		   stk.push(cur);
    		   if(cur.left!=null)
    		   {
    			   cur = cur.left;
    		   }
    		   else break;
    		   }
    	   }
       return node.val;
       }
       
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */