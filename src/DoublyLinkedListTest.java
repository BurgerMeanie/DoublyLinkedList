import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void append() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.append(1);
        assertEquals("1 -> NULL", dll.toString());
        dll.append(2);
        assertEquals("1 -> 2 -> NULL", dll.toString());
        dll.append(4);
        dll.append(3);
        assertEquals("1 -> 2 -> 4 -> 3 -> NULL", dll.toString());
    }

    @Test
    void testToString() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        assertEquals("NULL", dll.toString());
    }

    @Test
    void insert() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.append(1);
        assertEquals("1 -> NULL", dll.toString());
        dll.append(2);
        assertEquals("1 -> 2 -> NULL", dll.toString());
        dll.insert(1, 3);
        assertEquals("1 -> 3 -> 2 -> NULL", dll.toString());
        dll.insert(0, 2);
        assertEquals("2 -> 1 -> 3 -> 2 -> NULL", dll.toString());
    }

    @Test
    void delete() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.append(1);
        assertEquals("1 -> NULL", dll.toString());
        dll.append(2);
        assertEquals("1 -> 2 -> NULL", dll.toString());
        dll.insert(1, 3);
        assertEquals("1 -> 3 -> 2 -> NULL", dll.toString());
        dll.insert(0, 2);
        assertEquals("2 -> 1 -> 3 -> 2 -> NULL", dll.toString());
        dll.delete(2);
        assertEquals("2 -> 1 -> 2 -> NULL", dll.toString());
        dll.delete(0);
        assertEquals("1 -> 2 -> NULL", dll.toString());
        dll.delete(0);
        dll.delete(0);
        assertEquals("NULL", dll.toString());
    }
}