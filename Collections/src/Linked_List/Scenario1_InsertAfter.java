package Linked_List;

public class Scenario1_InsertAfter {

    static void insertAfter(Node c, int v) {
        Node n = new Node(v);
        n.next = c.next;
        c.next = n;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 4, 5);
        System.out.println("Before:");
        ListUtil.print(h);
        insertAfter(h.next, 3);
        System.out.println("After:");
        ListUtil.print(h);
    }
}
