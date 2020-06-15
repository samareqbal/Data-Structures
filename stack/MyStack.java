package stack;

import linkedlist.MyLinkedList;

public class MyStack<E> {
    private MyLinkedList list = new MyLinkedList<>();
    void push(E e){
        list.add(e);
    }
    E pop() throws Exception{
        if(list.isEmpty())
            throw new Exception("Popping from empty stack is not allowed");
        return (E) list.removeLast();
    }
    E peek() throws Exception{
        if(list.isEmpty())
            throw new Exception("Peeking from empty stack is not allowed");
        return (E) list.getLast();
    }
}
