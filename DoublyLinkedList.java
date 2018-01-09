package arnabFiles;

public class DoublyLinkedList<T extends Comparable<T>> implements List<T> {

	DoublyNode<T> root;
	int sizeoflist;
	
	@Override
	public void insert(T data) {
		
		this.sizeoflist++;
		
		if (root==null )
		{
			this.root = new DoublyNode<>(data);
		}
		
		else
		{
			DoublyNode<T> newNode = new DoublyNode<>(data);		
			this.root.setDPre(newNode);                           /* setting the previous pointer of old root to new node */

			newNode.setDNext(this.root);                     /* setting the previous root as next of new node......*/
			this.root = newNode;
			
		}
	}

	@Override
	public void remove(T data) {
		
		if(this.root ==  null)
			System.out.println("Empty list cannot be deleted");
		else
		  this.root =  removal(data);
	}
	
	
	private DoublyNode<T> removal (T data)
	{
      DoublyNode<T> ptr = this.root;
		
		while(ptr!= null)
		{
            if(ptr.getDData().equals(data))
            	break;
         ptr = ptr.getDNext();
		}	
		
	if(ptr == null)	
	  return root;	
	 
			 if(ptr.getDNext() != null)
		ptr.getDNext().setDPre(ptr.getDPre());     /*  updating the previous pointer's next field  to the previous node of ptr */
	 
	 if(ptr.getDPre() !=  null)
		 ptr.getDPre().setDNext(ptr.getDNext());           /* 	updating the next of previous node to the next node of ptr	*/
	 
	 if( ptr == root )
		 return root.next;
	 
		 return root;
		
	}
	
	
	
	

	@Override
	public void reverseList() {
		
		   this.root = reverse();
		   
		   if(root == null )
			   System.out.println("cannot reverse empty list");
	}
	
	
	private DoublyNode<T> reverse()
	{
		DoublyNode<T>  ptr = this.root;
	    DoublyNode<T>  follow = null,preced = ptr; 
		 
	    
	    while(ptr!=null)
		{
			follow = ptr.getDNext();
		    ptr.setDNext(ptr.getDPre());
		    ptr.setDPre(follow);
		    preced = ptr;
		    ptr = follow; 
		}
	    
	    return preced;
	    
	}

	@Override
	public void traverseList() {
		
		DoublyNode<T> ptr = this.root;
		
		if(ptr==null){
			System.out.println("empty list");
			return;
		}
		
		while( ptr!=null ){
			System.out.print(ptr+"->");
			ptr = ptr.getDNext();
		}
		
		
	}
	
	public void backTraverseList(){
		
		DoublyNode<T> ptr = this.root;
		
		while(ptr.getDNext()!=null)
		  ptr =ptr.getDNext();
	    
	    while(ptr!=null){
	    	System.out.print(ptr+"->");
	    	ptr=ptr.getDPre();
	    }
	
	}

	@Override
	public int size() {
		return this.sizeoflist;
	}

}
