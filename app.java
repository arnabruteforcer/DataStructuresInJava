package mytree;

public class app {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> b = new BinarySearchTree<>();
		
		b.insertKey(8);
		b.insertKey(5);
		b.insertKey(12);
		b.insertKey(14);
		b.insertKey(1);
		b.insertKey(6);
		 
		b.inorderTraversal();

		
	}

}
