package com.codecool.linkedLists.collections.singlyLinkedList;

public class Node<T> {
	private T value;
	private Node next = null;
	
	public Node(T value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}

