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

    @Test
    void getIndex() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        assertEquals(2, dll.getIndex(3));
        assertEquals(-1, dll.getIndex(6));
    }

    @Test
    void shuffle() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.append(1);
        dll.shuffle();
        assertEquals("1 -> NULL", dll.toString());
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> NULL", dll.toString());
        dll.shuffle();
        assertEquals("2 -> 1 -> 4 -> 3 -> 5 -> NULL", dll.toString());
    }
}