package Linked_List;

public class Scenario5_HasRedirectLoop {

    static boolean hasRedirectLoop(Node h) {
        Node s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 3);
        System.out.println(hasRedirectLoop(h));
        h.next.next.next = h.next;
        System.out.println(hasRedirectLoop(h));
    }
}
