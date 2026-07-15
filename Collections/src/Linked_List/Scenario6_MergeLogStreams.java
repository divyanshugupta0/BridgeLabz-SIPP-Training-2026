package Linked_List;

public class Scenario6_MergeLogStreams {

    static Node merge(Node a, Node b) {
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
        Node a = ListUtil.create(1, 3, 5);
        Node b = ListUtil.create(2, 4, 6);
        ListUtil.print(merge(a, b));
    }
}
