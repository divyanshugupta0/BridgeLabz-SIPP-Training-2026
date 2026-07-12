package Java_Generics;

interface MealPlan {
}

class VegetarianMeal implements MealPlan {
}

class VeganMeal implements MealPlan {
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T p) {
        plan = p;
    }
}

public class PersonalizedMealPlanGenerator {
    static <T extends MealPlan> void generate(T plan) {
        System.out.println(plan.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m = new Meal<>(new VegetarianMeal());
        generate(m.plan);
    }
}
