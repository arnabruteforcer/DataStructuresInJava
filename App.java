package arnabFiles;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list= new LinkedList<Integer>();
		
		list.insert(1);
		list.insert(2);
		list.insert(5);

		list.traverseList();
        list.remove(5);
        list.remove(2);
        list.remove(1);
        
        System.out.println();
        
        list.traverseList();
        
        System.out.println();
        
        list.reverseList();
		System.out.println();
		
		list.traverseList();
        
	}

}
