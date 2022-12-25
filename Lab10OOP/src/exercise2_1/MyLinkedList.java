package exercise2_1;

import java.util.Objects;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void add(Object o) {
        add(o, size);
    }

    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    public Object get(int index) {
        checkBoundaries(index,size-1);
        MyLinkedListNode current = getNodeByIndex(index);
        return current.getPayload();
    }

    public void remove(int index) {
        checkBoundaries(index,size-1);
        for (int i=index;i<size-1;i++){
            head = head.next;
        }
        head.next=null;
    }

    public int size() {
        return size;
    }
}
