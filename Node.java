
public class Node<T> {
	private T element;
	private Node<T> nextNode;
	
	/** initialize a new node with given element */
	public Node(T element) {
		this.element = element;
		nextNode = null;
	}
	
	/** Initialized a new node with given element and next node. */
	public Node(T element, Node<T> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}
	//Sourcce action for getters and setters for element and next node.

	public T getElement() {
		return element
	}
	public void setElement(T element){
		this.element = element;
	}

}