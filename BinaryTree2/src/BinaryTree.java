import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	
	private TreeNode root;
	
	private int node_number;
	
	
	
	//constructor function
	public BinaryTree() {
		super();
		node_number = 0;
	}
	
	
	//constructor function
	public BinaryTree(TreeNode root) {
		super();
		this.root = root;
		
		this.node_number = 1;
	}

	//constructor function
	public BinaryTree(BinaryTree bt){
		this.root = bt.root;
	}

	//constructor function
	public BinaryTree(TreeNode root, int node_number) {
		super();
		this.root = root;
		this.node_number = node_number;
	}
	
	
	public BinaryTree insert(int value){
		if(null !=root)
			insert(root,value);
		else{
			root = new TreeNode(value);
		}
		
		node_number++;
		
		return this;
		
		
	}
	
	//very important
	private void insert(TreeNode node,int value){
		if (node == null){
			return;
		}
		else{
			if (value<node.getValue()){
				if(node.getLeftchild()!=null){
					insert(node.getLeftchild(),value);
				}
				else{
					node.setLeftchild(new TreeNode(value));
					
				}
			}
			else{
				if(node.getRightchild()!=null){
					insert(node.getRightchild(),value);
				}
				else{
					node.setRightchild(new TreeNode(value));
				}
			}
		}
		
		
	}
	
	public boolean find (int value){
		
		int temp;
		
		if(root != null)
			return find(root,value);
		else
			return false;//the tree do not have a root
	}
	
	
	//very important
	private boolean find(TreeNode node, int value){
		
		if(value>node.getValue()){
			if(node.getRightchild()!=null){
				return find(node.getRightchild(),value);
			}
			else{
				return false;
			}
			}
		else{
			if(value<node.getValue()){
				if (node.getLeftchild()!=null){
				return find(node.getLeftchild(),value);
				}
				else{
					return false;
				}
			}
			else{
				System.out.println("the function have find the node "+node.getValue()+" .");
				return true;
			}
		}
	}
	

	//root left right
	public void display_preorder(){
		StringBuilder sb = new StringBuilder();
		if (null!=root){
			sb.append("the preorder of the binary tree is:");
			display_preorder(root,sb);
		}
		else{
			sb.append("the tree does not contain any node.");
		}
		
		System.out.println(sb.toString());
	}
	
	//very important
	private void display_preorder(TreeNode node,StringBuilder sb){
		
		sb.append(node.getValue()).append(" ");
		if(node.getLeftchild()!=null){
			//recursive process
			display_preorder(node.getLeftchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have left child.");
		}
		if(node.getRightchild()!=null){
			//recursive process
			display_preorder(node.getRightchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have right child.");
		}
		
	}
	
	//left right root
	public void display_postorder(){
		
		StringBuilder sb = new StringBuilder();
		if(root!=null){
			sb.append("the postorder of the tree is:");
			display_postorder(root,sb);
		}
		else{
			sb.append("the tree does not contain any node.");
		}
		
		System.out.println(sb.toString());
	}
	
	private void display_postorder(TreeNode node,StringBuilder sb){
		if (node.getLeftchild()!=null){
			//recursive process
			display_postorder(node.getLeftchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have left child.");
		}
		
		if(node.getRightchild()!=null){
			//recursive process
			display_postorder(node.getRightchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have right child.");
		}
		
		sb.append(node.getValue()).append(" ");
	}
	
	//left root right
	public void display_inorder(){
		StringBuilder sb = new StringBuilder();
		if(root!=null){
			sb.append("the inorder of the tree is:");
			display_inorder(root, sb);
		}
		else{
			sb.append("the tree does not contain any node.");
		}
		
		System.out.println(sb.toString());
	}
	
	private void display_inorder(TreeNode node, StringBuilder sb){
		if(node.getLeftchild()!=null){
			//recursive process
			display_inorder(node.getLeftchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have left child.");
		}
		
		sb.append(node.getValue()).append(" ");
		
		if(node.getRightchild()!=null){
			//recursive process
			display_inorder(node.getRightchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have right child.");
		}
		
	}
	
	
	
	//DFS is just like the preorder
	public void display_DFS(){
		StringBuilder sb = new StringBuilder();
		if(root!=null){
			sb.append("the DFS order of the tree is:");
			display_DFS(root, sb);
		}
		else{
			sb.append("the tree does not contain any node.");
			
		}
		
		System.out.println(sb.toString());
	}
	
	private void display_DFS(TreeNode node, StringBuilder sb){
		
		sb.append(node.getValue()).append(" ");
		
		if(node.getLeftchild()!=null){
			//recursive process
			display_DFS(node.getLeftchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have left child.");
		}
		if(node.getRightchild()!=null){
			//recursive process
			display_DFS(node.getRightchild(),sb);
		}
		else{
//			sb.append("the node ").append(node.getValue()).append(" does not have right child.");
		}
	}
	
	//use the queue
	public void display_BFS(){
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		StringBuilder sb = new StringBuilder();
		if(root==null){
			sb.append("the tree does not contain any node.");
		}
		else{
			sb.append("the BFS order of the tree is:");
			TreeNode node = root;
			queue.offer(node);
			
			while(!queue.isEmpty()){
				
				if(queue.peek().getLeftchild()!=null){
					
					//put the node into the queue
					queue.offer(queue.peek().getLeftchild());
				}
				if(queue.peek().getRightchild()!=null){
					
					//put the node into the queue
					queue.offer(queue.peek().getRightchild());
				}
				
				//put the node out of the node
				sb.append(queue.poll().getValue()).append(" ");
			}
			System.out.println(sb.toString());
		}
	}
	
	//delete the node 
	public boolean delete(int value){
		if(root==null){
			return false;
		}
		else{
			return delete(root,value);
		}	
	}
	
	//define the function of deleting the node
	public boolean delete(TreeNode node, int value){
		if(value<node.getValue()){
			if(node.getLeftchild()!=null){
				return delete(node.getLeftchild(),value);
			}
			else{
				return false;
			}
		}
		else if(value>node.getValue()){
			if(node.getRightchild()!=null){
				return delete(node.getRightchild(),value);
			}
			else{
				return false;
			}
		}
		//�ҵ���ȷ�ĵ㣬����ɾ������Ҫ���е��replace
		else{
			//����Ϊ�գ��Һ���ҲΪ�ա�
			if(node.getLeftchild()==null&&node.getRightchild()==null){
				//ֱ��ʹ�ڵ�Ϊnull����
				node = null;
				return true;
			}
			
			//���Ӳ�Ϊ�գ��Һ���Ϊ��
			else if(node.getLeftchild()!=null&&node.getRightchild()==null){
				//���ú���
				delete_nodewithleftchild(node);
				return true;
			}
			
			//�Һ��Ӳ�Ϊ�գ�����Ϊ��
			else if(node.getRightchild()!=null&&node.getLeftchild()==null){
				//���ú���
				delete_nodewithrightchild(node);
				return true;
			}
			
			//���Ӳ�Ϊ�գ��к��Ӳ�Ϊ��
			else if(node.getLeftchild()!=null&&node.getRightchild()!=null){
				//���ú���
				delete_nodewithtwochild(node);
				return true;
			}
			return true;
		}
	}	
	
	//ɾ���Ľڵ���������
	private TreeNode delete_nodewithleftchild(TreeNode node){
		TreeNode temp = new TreeNode();
		//���ú����ҵ������������ڵ�
		temp = findLargestNode(node.getLeftchild());
		node.setValue(temp.getValue());
		temp = null;
		
		return node;
	}
	
	//ɾ���Ľڵ���������
	private TreeNode delete_nodewithrightchild(TreeNode node){
		TreeNode temp = new TreeNode();
		//���ú����ҵ�����������С�ڵ�
		temp = findSmallestNode(node.getRightchild());
		node.setValue(temp.getValue());
		temp = null;
		
		return node;
	}

	//ɾ���Ľڵ�����������
	private TreeNode delete_nodewithtwochild(TreeNode node){
	
		TreeNode temp1 = new TreeNode();
		TreeNode temp2 = new TreeNode();
		
		//�����������ֵ
		temp1 = findLargestNode(node.getLeftchild());
		//����������Сֵ
		temp2 = findSmallestNode(node.getRightchild());
		
		//��������������������������������ѡ�񣬿���ѡ���������������ڵ�replace����ѡ������������С�ڵ�replace
		node.setValue(temp2.getValue());
		temp2 = null;
		
		return node;
	}

	
	//�ҵ���������߽ڵ㣬����С�ڵ�
	public TreeNode findLeftestNoe(TreeNode node){
		
		TreeNode temp = new TreeNode(node);
		
		while(temp.getLeftchild()!=null){
			temp.setValue(temp.getLeftchild().getValue());
			temp.setLeftchild(temp.getLeftchild().getLeftchild());
//			temp.setRightchild(temp.getLeftchild().getRightchild());
		}
		return temp;
	}
	
	//�ҵ��������ұ߽ڵ㣬�����ڵ�
	public TreeNode findRightestNode(TreeNode node){
		TreeNode temp = new TreeNode(node);
		
		while(temp.getRightchild()!=null){
			temp.setValue(temp.getRightchild().getValue());
			temp.setRightchild(temp.getRightchild().getRightchild());
//			temp.setLeftchild(temp.getRightchild().getLeftchild());
		}
		return temp;
	}
	
	
	//find out the smallest node, and put the variable node as the root of a tree
	public TreeNode findSmallestNode(TreeNode node){
		
		if(node.getLeftchild()!=null&&node.getRightchild()!=null){
			return findSmallestNode(node.getLeftchild());
		}
		else if(node.getLeftchild()!=null&&node.getRightchild()==null){
			return findSmallestNode(node.getLeftchild());
		}
		else if(node.getLeftchild()==null&&node.getRightchild()!=null){
			return node;
		}
		else{
			return node;
		}
	}

	
	//find out the largest node, and put the variable node as the root of a tree
	public TreeNode findLargestNode(TreeNode node){
		if (node.getLeftchild()!=null&&node.getRightchild()!=null){
			return findLargestNode(node.getRightchild());
		}
		else if(node.getLeftchild()==null&&node.getRightchild()!=null){
			return findLargestNode(node.getRightchild());
		}
		else if(node.getLeftchild()!=null&&node.getRightchild()==null){
			return node;
		}
		else{
			return node;
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		StringBuilder sb = new StringBuilder();
		
		sb.append("the root's value is:");
		
		sb.append(root.getValue());
		
		sb.append(",the root's leftchild is:");
		
		sb.append(root.getLeftchild().getValue());
		
		sb.append(",the root's rightchild is:");
		
		sb.append(root.getRightchild().getValue());
		
		sb.append('\n');
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public int getNode_number() {
		return node_number;
	}

	public void setNode_number(int node_number) {
		this.node_number = node_number;
	}
	
	

}
