package com.codecool.linkedLists.collections.singlyLinkedList;

import com.codecool.linkedLists.collections.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	void testAddValueToEmptyLinkedList() {
		
		
	}
	

	@Test
	void testGetElementWithInvalidIndexThrowsException() {
		LinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			linkedList.get(0);
		});
	}

}
