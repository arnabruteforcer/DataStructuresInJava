package arnabFiles;

public class DApp {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
			
		d.insert(2);
		d.insert(5);
		d.insert(6);
		d.insert(7);
		
		//d.backTraverseList();	
		 
		//d.reverseList();
		d.traverseList();
		d.remove(6);
		d.remove(7);
        d.remove(2);
        
        d.remove(8);
        d.remove(5);
		
		System.out.println();
		d.traverseList();
		
		
	}

}
