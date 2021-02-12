package Task1;

import Task1.method_left_rectangle;

public class task_1 {
    public static void main(String[] args) {
        method_left_rectangle method_left_rectangle = new method_left_rectangle();
        double itog = method_left_rectangle.integrate(x -> 1, 1, 10);
        System.out.println("Результат: "+ itog );
    }
}