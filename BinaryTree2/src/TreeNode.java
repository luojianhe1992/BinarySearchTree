
public class TreeNode {
	
	private int value;
	private TreeNode leftchild;
	private TreeNode rightchild;
	
	
	
	//constructor function
	public TreeNode() {
		super();
	}
	
	//constructor function
	public TreeNode(TreeNode node){
		super();
		
		this.value = node.getValue();
		
		this.leftchild = node.getLeftchild();
		
		this.rightchild = node.getRightchild();
		
	}
	
	//constructor function
	public TreeNode(int value){
		super();
		this.value = value;
		
		this.leftchild = null;
		
		this.rightchild = null;
		
	}




	//constructor function
	public TreeNode(int value, TreeNode leftchild, TreeNode rightchild) {
		super();
		this.value = value;
		this.leftchild = leftchild;
		this.rightchild = rightchild;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("the node's value is:");
		
		sb.append(value);
		
		sb.append(",the leftchild is:");
		
//		sb.append(leftchild.getValue());
		
		sb.append(",the rightchild is:");
		
//		sb.append(rightchild.getValue());
		
		sb.append('\n');
		
		return sb.toString();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(TreeNode leftchild) {
		this.leftchild = leftchild;
	}

	public TreeNode getRightchild() {
		return rightchild;
	}

	public void setRightchild(TreeNode rightchild) {
		this.rightchild = rightchild;
	}
	
	

}
