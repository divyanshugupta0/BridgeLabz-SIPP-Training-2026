package Linked_List;

public class LC206_ReverseLinkedList {

    static Node reverseList(Node h) {
        Node p = null, c = h;
        while (c != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 3, 4, 5);
        ListUtil.print(reverseList(h));
    }
}
