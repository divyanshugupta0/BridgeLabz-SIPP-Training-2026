package Linked_List;

public class LC19_RemoveNthFromEnd {

    static Node removeNth(Node h, int n) {
        Node d = new Node(0);
        d.next = h;
        Node f = d, s = d;
        for (int i = 0; i <= n; i++) f = f.next;
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return d.next;
    }

    public static void main(String[] args) {
        ListUtil.print(removeNth(ListUtil.create(1, 2, 3, 4, 5), 2));
    }
}
