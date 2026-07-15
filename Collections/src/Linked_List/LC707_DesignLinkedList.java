package Linked_List;

public class LC707_DesignLinkedList{

static class MyLinkedList{java.util.LinkedList<Integer> l=new java.util.LinkedList<>();void addAtHead(int v){l.addFirst(v);}void addAtTail(int v){l.addLast(v);}void deleteAtIndex(int i){if(i>=0&&i<l.size())l.remove(i);}int get(int i){return l.get(i);}}
public static void main(String[]args){MyLinkedList m=new MyLinkedList();m.addAtHead(2);m.addAtTail(5);System.out.println(m.get(1));}

}
