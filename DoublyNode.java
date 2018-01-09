package arnabFiles;

public class DoublyNode<T extends Comparable<T>> {
	
	T data;
	DoublyNode<T> next;
	DoublyNode<T> pre;
	
	public DoublyNode(T data) {
		this.data = data;
	}

	public T getDData() {
		return this.data;               /* i modified it*/ 
	}

	public void setDData(T data) {
		this.data = data;
	}

	public DoublyNode<T> getDNext() {
		return next;
	}

	public void setDNext(DoublyNode<T> next) {
		this.next = next;
	}

	public DoublyNode<T> getDPre() {
		return pre;
	}

	public void setDPre(DoublyNode<T> pre) {
		this.pre = pre;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
	
	
	
	

}
