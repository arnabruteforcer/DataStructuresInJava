package arnabFiles;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> head; 
	private int sizeOfList;
	
	@Override
	public void insert(T data) {
	 
		++this.sizeOfList;
		
		if(head == null)                             /*creating the first node*/
			this.head = new Node<>(data);

		else{
			Node<T> newNode= new Node<>(data); 
			newNode.setNext(head);                    //inserting the node at the beginning
			this.head = newNode;
		}
				
	}

	@Override
	public void remove(T data) {
		
		if(this.head == null)
			System.out.println("Empty List");
		 
		--this.sizeOfList;
		
		if(this.head.getData().compareTo(data) == 0)
		{
			System.out.println("Modifyng head");
			this.head = this.head.getNext();
			
		}
	    	
		else{
			remove (data,head,head.getNext());
		}
		
	}
	
    
	public void remove (T data, Node<T> previous, Node<T> current) throws NullPointerException
	{
		while( current!= null ){
			
		if(current.getData().compareTo(data) == 0){
			previous.setNext(current.getNext());        /* here we are modifying the next pointers */
			current =  null;
			return ;
		}
		
		previous = current;                            /* here we are actually modifying the object pointers */
        current = current.getNext();		
		}
	}
	

	@Override
	public void reverseList() {
		
		Node<T> ptr = this.head;
		Node<T> third = null;
		Node<T> prehead =  this.head;
		
		if(ptr == null)
		{
			System.out.println("you idiot this is an empty list");
			return;
		}
		
		else
		{	
			if( ptr.getNext()!= null)
			third = ptr.getNext().getNext();	
			
			
			this.head =  reverse(ptr,ptr.getNext(),third);
			prehead.setNext(null);                                 /* setting the ptr from frst node as null */

		}
		
	}
	
	private Node<T> reverse(Node<T> first, Node<T> second,Node<T> third)
	{
		if(second ==  null)                                           // base case for my recursion we have reached the last node 
			return first;
		
	
		second.setNext(first);
		
		first = second;
		second = third;
		
		if(third != null){
			third = third.getNext();
		}
		
		return(reverse(first, second, third));	
	}

	@Override
	public void traverseList() {
	 Node<T> cur = this.head;
	 
	 while(cur!=null)
	 {
		 System.out.print(cur+"->");
		 cur= cur.getNext();
	 }
	 
	}

	@Override
	public int size() {
		
		return this.sizeOfList;
	}

		


}
