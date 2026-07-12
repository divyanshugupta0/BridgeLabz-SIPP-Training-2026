package Generics;
public class Main{
    static void main() {
        box<Integer> b = new box<Integer>();
        b.setValue(1220);
        System.out.println(b.getValue());
    }
}