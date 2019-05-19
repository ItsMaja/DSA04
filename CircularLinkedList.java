package de.unistuttgart.vis.dsass2019.ex04.p2;

public class CircularLinkedList<T extends Comparable<T>> implements
		ICircularLinkedList<T> {
	private LinkedListNode <T> head = null;
	private LinkedListNode <T> tail = null;
	
	public CircularLinkedList () {
		head = new LinkedListNode();
		tail = new LinkedListNode();
		
		head.setNext(tail);
		tail.setPrev(head);
		tail.setNext(head);
	}
	
	public void append(T element) {
		LinkedListNode node = tail.getPrev();
		LinkedListNode next = new LinkedListNode(element, node, tail);
		node.setNext(next);
		tail.setNext(next);
	}
	
	public T get(int index) {
		return getLinkedListNodeAt(index).getElement();
	}

	
	public int size() {
		int s = 0;
		LinkedListNode node = head;
		while (node.getNext() != null) {
			s++;
			node = node.getNext();
			
		}
		return s;
	}

	public ILinkedListNode<T> getHead(){
		return head.getNext().getElement();
	}

}
