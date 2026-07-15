package Linked_List;

public class LC83_RemoveDuplicates {

    static Node deleteDuplicates(Node h) {
        Node c = h;
        while (c != null && c.next != null) {
            if (c.val == c.next.val) c.next = c.next.next;
            else c = c.next;
        }
        return h;
    }

    public static void main(String[] args) {
        ListUtil.print(deleteDuplicates(ListUtil.create(1, 1, 2, 3, 3)));
    }
}
