package Linked_List;

public class LC234_PalindromeLinkedList {

    static boolean isPalindrome(Node h) {
        java.util.ArrayList<Integer> a = new java.util.ArrayList<>();
        while (h != null) {
            a.add(h.val);
            h = h.next;
        }
        for (int i = 0, j = a.size() - 1; i < j; i++, j--) if (!a.get(i).equals(a.get(j))) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(ListUtil.create(1, 2, 2, 1)));
    }
}
