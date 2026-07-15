package Linked_List;

public class Scenario4_FindMiddleServer {

    static Node findMiddleServer(Node h) {
        Node s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Node h = ListUtil.create(1, 2, 3, 4, 5);
        System.out.println(findMiddleServer(h).val);
    }
}
