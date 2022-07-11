public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head;
    public DoublyLinkedList(){
    }
    public Node append(T data){
        Node<T> toAppend = new Node<>(data);

        if(this.head == null){
            this.head = toAppend;
            return this.head;
        }

        Node lastNode = this.head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = toAppend;

        return toAppend;
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
