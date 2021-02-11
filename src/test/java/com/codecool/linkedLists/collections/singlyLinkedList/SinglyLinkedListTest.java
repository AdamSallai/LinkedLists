package com.codecool.linkedLists.collections.singlyLinkedList;

import com.codecool.linkedLists.collections.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
	
	@Test
	void testGetElementWithInvalidIndexThrowsException() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(0);
		});
	}

	@Test
	void testGetElementWithNegativeIndexThrowsException() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(-1);
		});
	}
	

	@Test
	void testAddValueToEmptyLinkedList() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		
		assertEquals(10, linkedList.get(0));
	}

	@Test
	void testAddMultipleValuesToEmptyLinkedList() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		
		assertEquals(20, linkedList.get(2));
	}

	@Test
	void testRemoveElementFromLinkedList() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		linkedList.remove(15);
		
		assertEquals(2, linkedList.getSize());
		assertEquals(20, linkedList.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(2);
		});
		
	}

	@Test
	void testRemoveByIndexFromEmptyLinkedListThrowsException() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(0);
		});
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(-1);
		});
	}

	@Test
	void testRemoveByIndexFromLinkedList() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		Integer value = linkedList.removeByIndex(2);
		
		assertEquals(20, value);
		assertEquals(2, linkedList.getSize());
		assertEquals(15, linkedList.get(1));
		
	}
	

	@Test
	void testContains() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		
		assertTrue(linkedList.contains(20));
		assertFalse(linkedList.contains(0));
	}

	@Test
	void testIndexOf() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		
		assertEquals(-1, linkedList.indexOf(11));
		assertEquals(0, linkedList.indexOf(10));
		assertEquals(2, linkedList.indexOf(20));
	}
	
	@Test
	void testReverse() {
		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(20);
		linkedList.add(25);
		linkedList.reverse();
		

		assertEquals(25, linkedList.get(0));
		assertEquals(20, linkedList.get(1));
		assertEquals(15, linkedList.get(2));
		assertEquals(10, linkedList.get(3));
	}
	
	
}
