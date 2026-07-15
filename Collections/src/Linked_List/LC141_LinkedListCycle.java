package Linked_List;

public class LC141_LinkedListCycle {

    static boolean hasCycle(Node h) {
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
        System.out.println(hasCycle(h));
    }
}
