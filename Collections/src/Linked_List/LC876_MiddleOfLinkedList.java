package Linked_List;

public class LC876_MiddleOfLinkedList {

    static Node middleNode(Node h) {
        Node s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(middleNode(ListUtil.create(1, 2, 3, 4, 5)).val);
    }
}
