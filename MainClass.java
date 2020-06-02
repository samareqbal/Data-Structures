package linkedlist;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for(int i = 0 ; i < 20 ; i++){
            list.add(i);
        }
        list.print();
    }
}
