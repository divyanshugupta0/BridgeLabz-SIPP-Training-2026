import java.util.*;
public class Main{
    public static void main() {
        Student s = new Student(12,"India", 45);
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student(12,"Rudra",86));
        a1.add(new Student(14,"Res",86));
        System.out.println(a1.toString());
    }
}