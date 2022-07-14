public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head;
    public DoublyLinkedList(){
    }

    /***
     * The class 'append' should follow the following workflow.
     *
     * 1. Create a new node with the data that should be appended to the list.
     * 2. Check if there is a node in the list already.
     * 3. If there is no node, append the previous pointer to NULL, and the next pointer
     * to NULL.
     * 4. If there is a node already, append the last node in the list to this node's
     * previous pointer, and the after pointer to NULL. Also append the previous node's
     * next pointer to this node.
     *
     * @param data is the data to be appended to the list. If it is not the first
     *             item appended to the list, it should be the same data type as
     *             all previous items.
     * @return toAppend
     */
    public Node<T> append(T data){
        /*
        Create new node to hold the data to be appended
         */
        Node<T> toAppend = new Node<>(data);

        /*
        Check if there is a node in the list already. If not follow step 3.
         */
        if(this.head == null){
            this.head = toAppend;
            this.head.prev = null;
            this.head.next = null;
            return toAppend;
        }
        /*
        If this is being appended to an existing list, follow step 4.

        The node lastNode is a placeholder to work our way through the list to find out
        where the last node actually is.

        At the end of the while loop, lastNode.next is equal to null, meaning we have
        reached the end of the list.
         */
        Node<T> lastNode = this.head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        /*
        Now we will assign the next and previous pointers. Because these are complex data
        types, they are references to places in memory, and the pointers will remain after
        this function completes.
         */
        lastNode.next = toAppend;
        toAppend.prev = lastNode;

        return toAppend;
    }

    /***
     * The class 'insert' should have the following workflow.
     *
     * 1. It should determine that the location is within the list. If it is not in the
     * list, it should throw and IllegalArgumentException. Also, the function will work
     * slightly differently if it is the first space on the list.
     * 2. If the location is within the list, the data should be inserted, and the data
     * that was at that location should logically push all the following data one space
     * forward
     *
     * @param location denotes where in the list the information should be inserted.
     * @param data is the information that should be inserted into the list.
     * @return toInsert
     */
    public Node<T> insert(int location, T data) throws IllegalArgumentException{
        /*
        Create new nodes to hold the data to be inserted, as well as a node to mark
        our position within the list
         */
        Node<T> toInsert = new Node<>(data);
        Node<T> current = this.head;
        try {
            if (location != 0) {
                for (int i = 0; i < location; i++) {
                    if (current != null) {
                        current = current.next;
                    }
                    if (current == null){
                        return toInsert;
                    }
                }
            } else {
                current.prev = toInsert;
                toInsert.next = current;
                this.head = toInsert;
                return toInsert;
            }
        /*
        Once we have found the location in the list we reassign the pointers to move
        things forward
         */
            toInsert.prev = current.prev;
            toInsert.next = current;
            current.prev.next = toInsert;
            current.prev = toInsert;

            return toInsert;
        } catch(IllegalArgumentException e){
            return toInsert;
        }
    }

    /***
     * This class will have the following workflow.
     *
     * 1. Find the location within the list, assuming it exists, and taking action if it
     * does not.
     * 2. Link the previous item on the list to the item after the data to be deleted and
     * vise versa.
     * @param location determines which item to delete
     * @return toDelete
     */
    public Node<T> delete(int location){
        /*
        First, we create a node to hold our current location within the list
         */
        Node<T> current = this.head;
        /*
        Then, we work through the list until we get to the desired location.
         */
        if(location == 0){
            if(current.next == null){
                head = null;
                return current;
            } else {
                head = head.next;
                head.prev = null;
                return current;
            }
        } else {
            for(int i = 0; i < location; i++){
                if(current != null){
                    current = current.next;
                }
                if(current == null){
                    return null;
                }
            }
        }
        /*
        Now that we have found the location of the item to be removed from the list,
        we just have to remap the pointers
         */
        current.prev.next = current.next;
        if(current.next != null){
            current.next.prev = current.prev;
        }
        return current;
    }
    @Override
    public String toString(){
        Node<T> toPrint = this.head;

        StringBuilder stringBuilder = new StringBuilder();

        while(toPrint != null){
            stringBuilder.append(toPrint.data);
            stringBuilder.append(" -> ");

            toPrint = toPrint.next;
        }

        stringBuilder.append("NULL");

        return stringBuilder.toString();
    }
}
