import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void append() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        assertEquals(dll.toString(), "1 -> NULL");
    }

    @Test
    void testToString() {
    }
}