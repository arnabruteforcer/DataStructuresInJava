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
	System.out.print(ptr.getKey() + " ");
	inorder(ptr.getRight());
	
	}
	
	
	public void minNode()
	{
		if (root == null){
			System.out.println("empty tree");
		}
		
		System.out.println("The minimum node is " + getMin(root));
	}
	
	
	/* traverse down towards the left until u get to the bottom */
	/* node which will be the smallest*/
	private T getMin(TreeNode<T> node)
	{
		if(node.getLeft() ==  null){
			return node.getKey();
		}
		return getMin(node.getLeft());
	}
	
	/* traverse down towards the right until u get to the bottom */
	/* node which will be the largest*/
	
	public void getMax()
	{
		if( root == null){
			System.out.println("Empty Tree");
		}
		else{
			TreeNode<T> node = root;
			
			while(node.hasRightchild()){
				node = node.getRight();
			}
			System.out.println("Max node is " + node.getKey());
		}  		 							  // end of else
	
	}        			  /* end of method getMax().......*/
	
	
	public void deleteKey(T data)
	{
		if(root == null){
			System.out.println("Empty tree");
		}
		else
		{
			root = deleteNode(data,root,root);
		}
	}

	   												/* as it is an unthreaded tree we need to have a parent pointer to store the data */ 
	
	private TreeNode<T> deleteNode(T data, TreeNode<T> parent,TreeNode<T> node) {	
		
		if( node == null )                                 /* if we reached the end of tree */
		{
			System.out.println("key not found");
		}
		
		
		else{
			
			if( node.getKey().compareTo(data) == 0 )         /* we have found the key to be deleted */
			{
			    int side = -1;         
			    
				if(parent.getLeft() == node)
					side = 0;                                  // 0 corresponds for the left child
				else
					parent.setRight(null);
				
				
				if(!node.hasLeftchild() && !node.hasRightchild()){   /*case1: if its a leaf node ,set the left/right child for the parent pointer to be null*/
					
					
				}          								/* end of if for the node found..... */
				
				else if ( node.hasLeftchild()){
					
				}
				
				
			}
			
			else if( node.getKey().compareTo(data)>0 ){         /* if search key is smaller than current node value  we search on the left of current node*/
			   return ( deleteNode(data, node, node.getLeft()) );
		    }
		   
		   else{
			   return ( deleteNode(data, node, node.getRight()) );			/* if search key is greater than current node value  we search on the left of current node*/
		   }
		  
		
		}                    										/* end of outer else....... */
	
		return root;
		
	}																			/* end of deleteNode method....... */
	
	
}            			 /* end of binarySearchTree class  */
