# DoublyLinkedList
A Doubly Linked List

This Double Linked List has the following functions

### append
Appends data of the same type to the list.

### insert
Inserts data at a specified index. Data in that spot will be "moved" along with all the following nodes to "make room" for the inserted data.

### delete
Deletes data at a specified index. Data "after" that spot will be "moved" to fill its place.

### getIndex
Queries the list for specified data. If it is found in the list, it returns the index that it found it at.

### toString
Returns the list as a string. Mostly used for testing other methods, but can be used to see the entire list.

### shuffle
Shuffles the list. In reality, every two spots of data that are in the list just get flipped, giving the appearance of being shuffled.

### partition
Given specified data, creates a new list with any data in the original list that is larger than the specified data.
