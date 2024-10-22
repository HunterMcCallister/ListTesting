public class IUSingleLinkedList<T> implements IndexedUnsortedList<T>{
	private Node<T> head; //technically only required instance var
	private Node<T> tail; 
	private int size;
	private int modCount;

	/** initializes new empty list. */
	public IUSingleLinkedList(){
		head = tail = null;
		size = 0;
		modCount = 0;
	}

/** add this to size
	return size;

add to isEmpty
	return size == 0;
	return head == null;

first 
	if (isEmpty()){
		throw new noSuchElementException();
	}
	return head.getElement();
Last
	if (isEmpty()) {
		throw new noSuchElementException();
	}
	return tail.getElement();

copy and paste toString Method from array list.

indexOf
	Node<T> curentNode = head;
	int currentIndex = 0;
	while (currentNode != null && !currentNode.getElement().equals(element)){
		currentNode = currentNode.getNextNode();
		currentIndex++;
	}
	if (currentNode == null) {
		#currentiIndex = -1;
	}
	return currentIndex;



 */
}