package com.codecool.linkedLists.collections.singlyLinkedList;

import com.codecool.linkedLists.collections.LinkedList;

public class SinglyLinkedList<T> implements LinkedList<T> {

	private int size = 0;
	private Node<T> head = null;

	public void add(T value) {
		if (head == null) {
			head = new Node<T>(value);
		} else {
			Node<T> newNode = new Node<T>(value);
			Node<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}

	public T get(int index) {
		if (size <= index || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> current = head;
		int i = 0;
		while (i != index) {
			current = current.getNext();
			i++;
		}

		return current.getValue();
	}

	public void remove(T value) {
		if(head == null) {
			return;
		}
		if(head.getValue() == value) {
			head = head.getNext();
			size--;
		} else {
			Node<T> current = head;
			boolean over = false;
			int i = 0;
			while (!over && i < size) {
				if(current.getNext() == null) {
					over = true;
				} else if(current.getNext().getValue() == value) {
					Node<T> nextNode = current.getNext().getNext();
					current.setNext(nextNode);
					size--;
					over = true;
				} else {
					current = current.getNext();
				}
			}
		}
		
	}

	public T removeByIndex(int index) {
		if(size <= index || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		size--;
		if(index == 0) {
			T value = head.getValue();
			head = head.getNext();
			return value;
		} else {
			Node<T> current = head;
			for (int i = 0; i < index-1; i++) {
				current = current.getNext();
			}
			T value = current.getNext().getValue();
			current.setNext(current.getNext().getNext());
			return value;
		}
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
