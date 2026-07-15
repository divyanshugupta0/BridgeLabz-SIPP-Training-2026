package Linked_List;


public class ListUtil {
    static Node create(int... a) {
        if (a.length == 0) return null;
        Node h = new Node(a[0]), t = h;
        for (int i = 1; i < a.length; i++) {
            t.next = new Node(a[i]);
            t = t.next;
        }
        return h;
    }

    static void print(Node h) {
        while (h != null) {
            System.out.print(h.val);
            if (h.next != null) System.out.print(" -> ");
            h = h.next;
        }
        System.out.println();
    }
}
