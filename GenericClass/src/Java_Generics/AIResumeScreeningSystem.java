package Java_Generics;

import java.util.Arrays;
import java.util.List;

abstract class JobRole {
}

class SoftwareEngineer extends JobRole {
}

class DataScientist extends JobRole {
}

class ProductManager extends JobRole {
}

class Resume<T extends JobRole> {
    T role;

    Resume(T r) {
        role = r;
    }
}

public class AIResumeScreeningSystem {
    static void process(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println(r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        process(Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager()));
    }
}
