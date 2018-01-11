package mytree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{

	private TreeNode<T> root;
	
	@Override
	public void insertKey(T data) {
		
		if(root == null)
		{
			root =  new TreeNode<>();
			root.setKey(data);              // havent made a constructor
		}
		
		else
		{
			insert(data,root);
		}
		
	}
	
	
	private void insert(T data, TreeNode<T> ptr)
	{
	   if(data.compareTo(ptr.getKey())>0){   // new node is larger than current node must go to right subtree 
		   
		   if(!ptr.hasRightchild())
		   {
			   TreeNode<T> newNode = new TreeNode<>();
			   newNode.setKey(data);
			   ptr.setRight(newNode);
		   }
		   
		   else insert( data,ptr.getRight() );
	   }
	   
	   
	   else                      // new node must be inserted in left subtree
	   {
		   if(!ptr.hasLeftchild())
		   {
			   TreeNode<T> newNode = new TreeNode<>();
			   newNode.setKey(data);
			   ptr.setLeft(newNode);
			   
		   }
		   
		   else insert( data , ptr.getLeft() );
	   }
	   
	}   // end of insert....

	@Override
	public void inorderTraversal() {
		
		if(root == null){
			System.out.println("Empty tree");
		}
		
		else{
			inorder(root);
		}
	}
    	
	private void inorder(TreeNode<T> ptr)
	{
		if(ptr == null)
			return ;
		
	inorder(ptr.getLeft());               // recursing down to the left subtree
	System.out.println(ptr.getKey() + " ");
	inorder(ptr.getRight());
	
	}
	
  
}             /* end of binarySearchTree class  */
