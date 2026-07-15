package Linked_List;

public class Scenario2_RemoveTask {

    static Node removeTask(Node h, int x) {
        if (h.val == x) return h.next;
        Node p = h, c = h.next;
        while (c != null && c.val != x) {
            p = c;
            c = c.next;
        }
        if (c != null) p.next = c.next;
        return h;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 3, 4, 5);
        ListUtil.print(h);
        h = removeTask(h, 3);
        ListUtil.print(h);
    }
}
