package Java_Generics;

import java.util.Arrays;
import java.util.List;

abstract class CourseType {
}

class ExamCourse extends CourseType {
}

class AssignmentCourse extends CourseType {
}

class ResearchCourse extends CourseType {
}

class Course<T extends CourseType> {
    T type;

    Course(T t) {
        type = t;
    }
}

public class UniversityCourseManagementSystem {
    static void show(List<? extends CourseType> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        show(Arrays.asList(new ExamCourse(), new ResearchCourse()));
    }
}
