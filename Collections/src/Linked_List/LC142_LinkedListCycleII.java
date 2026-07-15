package Linked_List;

public class LC142_LinkedListCycleII {

    static Node detectCycle(Node h) {
        Node s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                Node p = h;
                while (p != s) {
                    p = p.next;
                    s = s.next;
                }
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 3);
        h.next.next.next = h.next;
        System.out.println(detectCycle(h).val);
    }
}
