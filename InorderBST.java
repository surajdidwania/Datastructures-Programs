import java.util.Scanner;
import java.util.Stack;

	public class InorderBST{
		public static class Treenode{
			int data;
			Treenode left;
			Treenode right;
			Treenode parent;
			Treenode(int data)
			{
				this.data=data;
			}
		}
		public void inorder(Treenode root)
		{
			if(root!=null){
				
				
				inorder(root.left);
				System.out.printf("%d",root.data);
				inorder(root.right);
				
			}
			
		}
		public void inorderiter(Treenode root)
		{
			if(root==null)
				return;
			Stack<Treenode> s = new Stack<Treenode>();
			Treenode currentnode = root;
			while(!s.empty() || currentnode!=null )
			{
				if(currentnode!=null)
				{
					s.push(currentnode);
					currentnode = currentnode.left;
				}
				else
				{
					Treenode c= s.pop();
					System.out.printf("%d",c.data);
					currentnode = c.right;
				}
			}
		}
			public static void search(Treenode root, int k)
			{
				if(root == null || k == root.data)
					System.out.println("found");
				else if( k< root.data)
					 search(root.left,k);
				else
					 search(root.right,k);
			}
			public static Treenode successor(Treenode node)
			{
				if(node.right != null)
					return Treemin(node.right);
				Treenode y = node.parent;
				Treenode x = node;
				while(y != null && x == y.right)
				{
					x = y;
					y = y.parent;
				}
				return y;
			}
			public static Treenode Treemin(Treenode node)
			{
				while(node.left!=null)
				{
					node = node.left;
				}
				return node;
				
			}
			public static void treeinsert(Treenode node,Treenode z)
			{
				Treenode y = null;
				Treenode x = node;
				while (x!=null)
				{
					y=x;
					if(z.data < x.data )
						x=x.left;
					else
						x=x.right;
				}
				z.parent = y;
				if (y==null)
					node = z;
				else 
					if(z.data  < y.data)
						y.left = z;
					else
						y.right=z;
			}
			public static void transplant(Treenode node, Treenode u, Treenode v)
			{
				if(u.parent == null)
				{
					node = v;
				}
				else if(u==u.parent.left)
					u.parent.left=v;
				else
					u.parent.right=v;
				if(v!=null)
					v.parent=u.parent;
			}
			public static void delete(Treenode node, Treenode q)
			{
				Treenode u = null;
				if(q.left == null)
					transplant(node, q,q.right);
				else if(q.right==null)
					transplant(node,q,q.left);
				else 
				  u = Treemin(q.right);
					if (u.parent != q)
					{
						transplant(node,u,u.right);
						u.right = q.right;
						u.right.parent=u;
					}
					else{
					transplant(node,q,u);
					u.left = q.left;
					u.left.parent = u;
					}
				
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Scanner sc = new Scanner(System.in);
		InorderBST bi = new InorderBST();
		Treenode rootnode = createBinaryTree();
		bi.inorder(rootnode);
		System.out.println();
		bi.inorderiter(rootnode);
		System.out.println();
		System.out.println("Pleae enter the value to be search");
		int k = sc.nextInt();
		search(rootnode,k);
		Treenode l = successor(rootnode);
		System.out.println(l.data);
		System.out.println("Pleae enter the value to be added");
		int s = sc.nextInt();
		Treenode newnode = new Treenode(s);
		treeinsert(rootnode,newnode);
		bi.inorder(rootnode);
		System.out.println();
		System.out.println("Pleae enter the value to be deleted");
		int s1 = sc.nextInt();
		Treenode newnode1 = new Treenode(s1);
		delete(rootnode,newnode1);
		bi.inorder(rootnode);
	}
	
	public static Treenode createBinaryTree() {
		// TODO Auto-generated method stub
		Treenode rootnode = new Treenode(40);
		Treenode r40 = new Treenode(50);
		Treenode l40 = new Treenode(20);
		Treenode r50 = new Treenode(60);
		Treenode l50 = new Treenode(45);
		Treenode r20 = new Treenode(30);
		Treenode l20 = new Treenode(10);
		rootnode.right = r40;
		rootnode.left = l40;
		r40.right=r50;
		r40.left = l50;
		l40.right=r20;
		l40.left=l20;
		 r40.parent=rootnode; l40.parent= rootnode;
		 r50.parent=r40;
		l50.parent=r40 ;
		 r20.parent=l40;
		 l20.parent=l40 ;
		return rootnode;
		
	}

}
