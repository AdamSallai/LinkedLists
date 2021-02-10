package com.codecool.linkedLists.collections.singlyLinkedList;

import com.codecool.linkedLists.collections.LinkedList;

public class SinglyLinkedList<T> implements LinkedList<T>{
	
	private int size = 0;
	private Node<T> head = null;

	public void add(T value) {
		if(head == null) {
			head = new Node<T>(value);
		}
		size++;
	}

	public T get(int index) {
		if(size <= index || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return null;
	}

	public void remove(T value) {
		// TODO Auto-generated method stub
		
	}

	public T removeByIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(T value) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSize() {
		return size;
	}

}
