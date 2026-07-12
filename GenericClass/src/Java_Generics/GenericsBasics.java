package Java_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    void push(T value) {
        list.add(value);
    }

    T pop() {
        return list.remove(list.size() - 1);
    }
}

class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    void add(T value) {
        data.add(value);
    }

    void display() {
        for (T x : data) System.out.println(x);
    }
}

public class GenericsBasics {
    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T x : arr) if (x.compareTo(max) > 0) max = x;
        return max;
    }

    static void print(List<?> list) {
        for (Object x : list) System.out.println(x);
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Java", 101);
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        Integer[] a = {5, 8, 2, 9};
        System.out.println(findMax(a));
        Repository<String> r = new Repository<>();
        r.add("A");
        r.add("B");
        r.display();
        print(Arrays.asList("X", "Y", "Z"));
    }
}
