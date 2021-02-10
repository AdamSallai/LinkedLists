package com.codecool.linkedLists.collections.singlyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	public void testNodeValue() {
		Node<String> nameNode = new Node<String>("Adam");
		Node<Integer> numberNode = new Node<Integer>(23);
		
		assertEquals("Adam", nameNode.getValue());
		assertEquals(23, numberNode.getValue());
	}
	
	@Test
	public void testNodeNext() {
		Node<Integer> numberNode = new Node<Integer>(10);
		Node<Integer> secondNumberNode = new Node<Integer>(23);
		
		numberNode.setNext(secondNumberNode);
		
		assertEquals(23, numberNode.getNext().getValue());
		assertNull(secondNumberNode.getNext());
	}
}
