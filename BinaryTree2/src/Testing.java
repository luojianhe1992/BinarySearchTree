
public class Testing {

	public static void main(String [] args){
		
//		TreeNode node1 = new TreeNode(5);
//		TreeNode node2 = new TreeNode(3);
//		TreeNode node3 = new TreeNode(1);
//		TreeNode node4 = new TreeNode(4);
//		TreeNode node5 = new TreeNode(7);
//		TreeNode node6 = new TreeNode(6);
//		TreeNode node7 = new TreeNode(8);
//		
//		System.out.println(node1);
		
		
		System.out.println("**********************");
		System.out.println("Start a new tree.");
		System.out.println("**********************");
		
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
		
		
		TreeNode node_largest = new TreeNode();
		node_largest = bt.findLargestNode(bt.getRoot());
		System.out.println("the largest value of the tree is:"+node_largest.getValue());
		
		TreeNode node_smallest = new TreeNode();
		node_smallest = bt.findSmallestNode(bt.getRoot());
		System.out.println("the smallest value of the tree is:"+node_smallest.getValue());
		
		TreeNode node_leftest = new TreeNode();
		node_leftest = bt.findLeftestNoe(bt.getRoot());
		System.out.println("the leftest node of the tree is:"+node_leftest.getValue());
		
		TreeNode node_rightest = new TreeNode();
		node_rightest = bt.findRightestNode(bt.getRoot());
		System.out.println("the rightest node of the tree is:"+node_rightest.getValue());
		
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
		
		System.out.println("***************************");
		bt.display_BFS();
		System.out.println("***************************");
		
		
		
		
		
		
		
		
		System.out.println("**********************");
		System.out.println("Start a new tree.");
		System.out.println("**********************");
		
		
		System.out.println();
		
		BinaryTree bt2 = new BinaryTree();
		
		System.out.println("insert the node 9.");
		bt2.insert(9);
		System.out.println("the root is:"+bt2.getRoot().getValue());
		
		System.out.println("insert the node 8.");
		bt2.insert(8);
		
		System.out.println("insert the node 7.");
		bt2.insert(7);
		
		System.out.println("insert the node 3.");
		bt2.insert(3);
		
		System.out.println("insert the node 4.");
		bt2.insert(4);
		
		System.out.println("insert the node 5.");
		bt2.insert(5);
		
		System.out.println("insert the node 6.");
		bt2.insert(6);
		
		System.out.println("the root of the tree is:"+bt2.getRoot().getValue());
		
		System.out.println("the leftchild of the root is:"+bt2.getRoot().getLeftchild().getValue());
		
		System.out.println("the leftchild of the leftchild of the root is:"+bt2.getRoot().getLeftchild().getLeftchild().getValue());
		
		System.out.println("the val_test is:"+bt.find(6));
		
		TreeNode node_smallest2 = new TreeNode();
		node_smallest2 = bt2.findSmallestNode(bt2.getRoot());
		System.out.println("the smallest value of the tree2 is:"+node_smallest2.getValue());
		
		TreeNode node_largest2 = new TreeNode();
		node_largest2 = bt2.findLargestNode(bt2.getRoot());
		System.out.println("the largest value of the tree2 is:"+node_largest2.getValue());
		
		TreeNode node_leftest2 = new TreeNode();
		node_leftest2 = bt2.findLeftestNoe(bt2.getRoot());
		System.out.println("the leftest node of the tree is:"+node_leftest2.getValue());
		
		TreeNode node_rightest2 = new TreeNode();
		node_rightest2 = bt2.findRightestNode(bt2.getRoot());
		System.out.println("the rightest node of the tree is:"+node_rightest2.getValue());
		
		
		
		
		
		
		
		

		System.out.println("**********************");
		System.out.println("Start a new tree.");
		System.out.println("**********************");
		
		BinaryTree bt3 = new BinaryTree();
		
		System.out.println("insert the node 3.");
		bt3.insert(3);
		System.out.println("the root is:"+bt3.getRoot().getValue());
		
		System.out.println("insert the node 4.");
		bt3.insert(4);
		
		System.out.println("insert the node 9.");
		bt3.insert(9);
		
		System.out.println("insert the node 7.");
		bt3.insert(7);
		
		System.out.println("insert the node 6.");
		bt3.insert(6);
		
		System.out.println("insert the node 5.");
		bt3.insert(5);
		
		System.out.println("insert the node 2.");
		bt3.insert(2);
		
		TreeNode node_smallest3 = new TreeNode();
		node_smallest3 = bt3.findSmallestNode(bt3.getRoot());
		System.out.println("the smallest value of the tree2 is:"+node_smallest3.getValue());
		
		TreeNode node_largest3 = new TreeNode();
		node_largest3 = bt3.findLargestNode(bt3.getRoot());
		System.out.println("the largest value of the tree2 is:"+node_largest3.getValue());
		
		TreeNode node_leftest3 = new TreeNode();
		node_leftest3 = bt3.findLeftestNoe(bt3.getRoot());
		System.out.println("the leftest node of the tree is:"+node_leftest3.getValue());
		
		TreeNode node_rightest3 = new TreeNode();
		node_rightest3 = bt3.findRightestNode(bt2.getRoot());
		System.out.println("the rightest node of the tree is:"+node_rightest3.getValue());
		
		
		
		
		boolean m =  bt3.delete(4);
		
		System.out.println("true:"+m);
		
		System.out.println("the root of the tree is:"+bt3.getRoot().getValue());
		
	}
}
