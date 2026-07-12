package Java_Collections;

import java.util.LinkedList;

public class MusicPlaylistRecommendationEngine {
    public static void main(String[] a) {
        LinkedList<String> l = new LinkedList<>();
        for (int i = 1; i <= 12; i++) {
            l.addFirst("Song" + i);
            if (l.size() > 10) l.removeLast();
        }
        System.out.println(l.contains("Song5"));
        for (String s : l) System.out.println(s);
    }
}