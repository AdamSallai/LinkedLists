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

}
