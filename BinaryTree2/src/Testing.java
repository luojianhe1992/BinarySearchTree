
public class Testing {

	public static void main(String [] args){
		
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(8);
		
		System.out.println(node1);
		
		BinaryTree bt = new BinaryTree();
		
		System.out.println("insert the node 5.");
		bt.insert(5);
		
		System.out.println("the root is:"+bt.getRoot().getValue());
		
		
		System.out.println("insert the node 3.");
		bt.insert(3);
	
		System.out.println("insert the node 1.");
		bt.insert(1);		
		
		System.out.println("insert the node 4.");
		bt.insert(4);
		
		System.out.println("insert the node 7.");
		bt.insert(7);
		
		System.out.println("insert the node 6.");
		bt.insert(6);
		
		System.out.println("insert the node 8.");
		bt.insert(8);
		
		System.out.println("the root of the tree is:"+bt.getRoot().getValue());
		
		System.out.println("the leftchild of the root is:"+bt.getRoot().getLeftchild().getValue());
		
		System.out.println("the leftchild of the leftchild of the root is:"+bt.getRoot().getLeftchild().getLeftchild().getValue());
		
		System.out.println("the rightchild of the leftchild of the root is:"+bt.getRoot().getLeftchild().getRightchild().getValue());
		
		System.out.println("the rightchild of the root is:"+bt.getRoot().getRightchild().getValue());
		
		System.out.println("the leftchild of the rightchild of the root is:"+bt.getRoot().getRightchild().getLeftchild().getValue());
		
		System.out.println("the rightchild of the rightchild of the root is:"+bt.getRoot().getRightchild().getRightchild().getValue());
		
		System.out.println("the val_test is:"+bt.find(10));
		
		
		System.out.println(bt);
		
		System.out.println("***************************");
		bt.display_preorder();
		System.out.println("***************************");
		
		System.out.println();
		
		System.out.println("***************************");
		bt.display_postorder();
		System.out.println("***************************");
		
		System.out.println();
		
		System.out.println("***************************");
		bt.display_inorder();
		System.out.println("***************************");
		
		System.out.println("***************************");
		bt.display_DFS();
		System.out.println("***************************");
		
		System.out.println("***************************");
		
		System.out.println("*******~~********************");
		bt.display_BFS();
		System.out.println("***************************");
		
	}
}
