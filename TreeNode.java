package mytree;

public class TreeNode <T> {
	
	T key;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	
	public boolean hasLeftchild()
	  {
		  return (!( this.getLeft() == null ) ); 
	  }
	
	public boolean hasRightchild()
	  {
		  return (!( this.getRight() == null ) ); 
	  }
	
	@Override
	public String toString() {
		return this.key.toString();
	}
	
	
}

