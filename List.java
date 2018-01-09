package arnabFiles;

public interface List<T> {               // generic type

	public void insert(T data);
	public void remove(T data);
	public void reverseList();
	public void traverseList();
	public int size();
	
}
