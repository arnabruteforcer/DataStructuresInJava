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
	
	/* used for finding the greatest node on a particular subtree */
	/*used for finding inorder predecessor */
	
	private TreeNode<T> greatestNode(TreeNode<T> pointer)
	{
		if(pointer.getRight() == null)                /* when there are nod nodes to the left return that node */
			return pointer;
		
		return(greatestNode(pointer.getRight()));
	}
	
	/* used for finding the least node on a particular subtree */
	/*	used for finding inorder predecessor */
	
	private TreeNode<T> leastNode(TreeNode<T> pointer)
	{
		if(pointer.getLeft()!= null)
			return(leastNode(pointer.getLeft()));
		
		return pointer;
	}
	
	
	
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
					side = 1;
				
				
				if(!node.hasLeftchild() && !node.hasRightchild()){   /*case1: if its a leaf node ,set the left/right child for the parent pointer to be null*/
					
			/* the child to be removed is leftchild*/ 
					
					if(side == 0){
					parent.setLeft(null);	
					}
					else                                  /* the right child is the node to be removed */
						parent.setRight(null);
					
				}          								/* end of if for the node found  is aleaf node..... */
				
				else if ( node.hasLeftchild() && node.hasRightchild()) {
					
					TreeNode<T> predecessor = greatestNode(node.getLeft());
					TreeNode<T> parentforpre = ancestor(root,predecessor.getKey());
					
					predecessor.setLeft(node.getLeft());
					predecessor.setRight(node.getRight());
					
					
					
				}
				
				
			}                /* end of loop for the case when the node is found .....*/
			
			
			
			else if( node.getKey().compareTo(data)>0 ){         /* if search key is smaller than current node value  we search on the left of current node*/
			   return ( deleteNode(data, node, node.getLeft()) );
		    }
		   
		   else{
			   return ( deleteNode(data, node, node.getRight()) );			/* if search key is greater than current node value  we search on the left of current node*/
		   }
		  
		
		}                    										/* end of outer else for detecting presence of node to be deleted....... */
	
		return root;
			
		
	}																			/* end of deleteNode method....... */

	private TreeNode<T> ancestor(TreeNode<T> node, T key) {
	
		
		/* if current node is greater than the one to be found */
		if(node.getKey().compareTo(key)>0)    
		{
			if(node.getLeft().getKey() == key)
				return node;

			return ancestor(node.getLeft(),key); 	
		}
		
		
		/* if current node is smaller than the one to be found */
		else
		{
			if(node.getRight().getKey() == key)
				return node;
			
			return( ancestor(node.getRight(),key) );
			
		}
		
	}
	
	
}            			 /* end of binarySearchTree class  */
