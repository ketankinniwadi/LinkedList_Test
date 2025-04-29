package test.java;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import LinkedList.LinkedList;

class LinkedListTest {

    private LinkedList list;

    @BeforeEach
    void setUp() {
        list = new LinkedList();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(list.isEmpty(), "List should be empty initially");
    }

    @Test
    void testInsertAtHead() {
        list.insertAtHead(10);
        assertEquals(10, list.getHead().getM_data());
        assertEquals(1, list.getSize());
    }

    @Test
    void testInsertAtTail() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        assertEquals(10, list.getHead().getM_data());
        assertEquals(3, list.getSize());
    }

    @Test
    void testInsertAtPosition() {
        list.insertAtHead(10);
        list.insertAtTail(30);
        list.InsertAtPos(2, 20);  // Insert 20 at position 2

        assertEquals(3, list.getSize());
        assertEquals(20, list.getHead().getM_next().getM_data());
    }

    @Test
    void testDeleteAtHead() {
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.DeleteAtHead();
        
        assertEquals(10, list.getHead().getM_data());
        assertEquals(1, list.getSize());
    }

    @Test
    void testDeleteAtTail() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        
        list.DeleteAtTail();
        assertNull(list.getHead().getM_next().getM_next());
        assertEquals(2, list.getSize());
    }

    @Test
    void testDeleteAtPosition() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.DeleteAtPos(2);  // Delete 20
        assertEquals(30, list.getHead().getM_next().getM_data());
        assertEquals(2, list.getSize());
    }

    @Test
    void testSearchFound() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        assertTrue(list.search(20));
    }

    @Test
    void testSearchNotFound() {
        list.insertAtHead(10);
        list.insertAtTail(20);

        assertFalse(list.search(99));
    }

    @Test
    void testReverse() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.reverse();
        assertEquals(30, list.getHead().getM_data());
    }

    @Test
    void testFindMiddleOdd() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        assertEquals(20, list.findMiddle());
    }

    @Test
    void testFindMiddleEven() {
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        assertEquals(20, list.findMiddle()); // first middle for even list
    }

    @Test
    void testFindMiddleEmptyList() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            list.findMiddle();
        });
        assertEquals("List is empty", exception.getMessage());
    }
}
