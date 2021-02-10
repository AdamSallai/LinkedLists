package com.codecool.linkedLists.collections;

public interface LinkedList<T> {
	
	public void add(T value);
	
	public T get(int index);
	
	public void remove(T value);
	
	public T removeByIndex(int index);
	
	public boolean contains(T value);
	
	public int indexOf(T value);
	
	public int getSize();
}
