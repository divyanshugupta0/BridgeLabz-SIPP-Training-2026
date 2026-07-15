package Linked_List;

public class LC21_MergeTwoSortedLists {

    static Node mergeTwoLists(Node a, Node b) {
        Node d = new Node(0), t = d;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        t.next = a != null ? a : b;
        return d.next;
    }

    public static void main(String[] args) {
        ListUtil.print(mergeTwoLists(ListUtil.create(1, 3, 5), ListUtil.create(2, 4, 6)));
    }
}
