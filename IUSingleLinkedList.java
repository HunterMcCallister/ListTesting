
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Single-linked node-based implementation of IndexedUnsortedList with basic
 * Iterator
 * including remove
 * 
 * @author Hunter McCallister
 */
public class IUSingleLinkedList<T> implements IndexedUnsortedList<T> {

    private Node<T> head; // technically only required instance var
    private Node<T> tail; // makes addToRear O(1),
    private int size;// makes size O(1)
    private int modCount;

    /**
     * initializes new empty list.
     */
    public IUSingleLinkedList() {
        head = tail = null;
        size = 0;
        modCount = 0;
    }

    @Override
    public void addToFront(T element) {

        Node<T> newNode = new Node<T>(element);
        newNode.setNextNode(head);
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
        modCount++;
    }

    @Override
    public void addToRear(T element) {
        Node<T> newNode = new Node<T>(element);
        if (isEmpty()) { // or size==0
            head = newNode;
        } else {
            tail.setNextNode(newNode);
        }
        tail = newNode;
        size++;
        modCount++;
    }

    @Override
    public void add(T element) {
        addToRear(element);
    }

    @Override
    public void addAfter(T element, T target) {
        // Node<T>curNode = head;
        // while(target != curNode && curNode.getNextNode() != null){
        //     curNode = curNode.getNextNode();   
        // } 
        // if(curNode.getNextNode() == null){
        //     throw new NoSuchElementException();
        // }
        // if (curNode == tail){
        //     add(element);
        // } else {

        

        // Node<T> newElement = new Node<T>(element);
        // Node<T> tempNode = curNode.getNextNode();
        // curNode.setNextNode(newElement);
        // newElement.setNextNode(tempNode);
        // modCount++;
        // size++;
        // }
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addToFront(element);
        } else {
            Node<T> curNode = head;
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.getNextNode();
            }
            Node<T> newNode = new Node<T>(element);
            newNode.setNextNode(curNode.getNextNode());
            curNode.setNextNode(newNode);
            if (newNode.getNextNode() == null) { // or curNode == tail
                tail = newNode;
            }
        }
        size++;
        modCount++;
    }

    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public T remove(T element) {
        T retVal;

        if (isEmpty()){
            throw new NoSuchElementException(); //or next was null
        }

        if (element.equals(head.getElement())){
            retVal = head.getElement();
            head = head.getNextNode();
            if (head == null){//head was the only node
                tail = null;//the list is empty and there are no nodes.
            }
        }else {
        Node<T> currentNode = head;
        while (currentNode.getNextNode() != null //curNode == tail also works
            && !currentNode.getNextNode().getElement().equals(element)){
            currentNode = currentNode.getNextNode();
        }
        if (currentNode == tail){  //or next was null
            throw new NoSuchElementException();
        }
        retVal = currentNode.getNextNode().getElement();
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        if (currentNode.getNextNode() == null){
            tail = currentNode;
        }
    }

        size--;
        modCount++;

        return retVal;
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int indexOf(T element) {
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && !currentNode.getElement().equals(element)) {
            currentNode = currentNode.getNextNode();
            currentIndex++;
        }
        if (currentNode == null) {
            currentIndex = -1;
        }
        return currentIndex;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.getElement();
    }

    @Override
    public T last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return tail.getElement();
    }

    @Override
    public boolean contains(T target) {
        return indexOf(target) != 1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
        // return head == null; you can use either one.
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (T element : this) {
            sb.append(element.toString());
            sb.append(", ");
        }
        if (size() > 0) {
            sb.delete(sb.length() - 2, sb.length()); // remove trailing ", "
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int startingIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }
}
