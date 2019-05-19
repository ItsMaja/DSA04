package de.unistuttgart.vis.dsass2019.ex04.p2;

public class LinkedListNode<T extends Comparable<T>> implements ILinkedListNode<T>{
	
	private LinkedListNode<T> next;
	private LinkedListNode<T> prev;
	private T element;

	private LinkedListNode (final T element, final LinkedListNode<T> prev, final LinkedListNode<T> next) {
		this.element = element;
		this.prev = prev;
		this.next = next;
	}
	
	public LinkedListNode () {
		element = null;
		next = null;
		prev = null;
	}
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public ILinkedListNode<T> getNext(){
		return next;
	}
	
	
	public void setNext(ILinkedListNode<T> next) {
		this.next = next;
		
	}
		
	public ILinkedListNode<T> getPrev(){
		return prev;
	}
	
	public void setPrev(ILinkedListNode<T> prev) {
		this.prev = prev;
	}

}
