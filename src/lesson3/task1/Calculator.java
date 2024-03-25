package lesson3.task1;

public class Calculator<T,X> {
    public static int num1;
    public static double num2;
    public static double res;

    public static <T extends Number, X extends Number> double  sum(T t, X x) {
        return t.doubleValue() + x.doubleValue();
    }

    public static <T extends Number, X extends Number> double  multiply (T t, X x) {
        return t.doubleValue() * x.doubleValue();
    }
    public static <T extends Number, X extends Number> double divide(T t, X x) {
        if (x.doubleValue() == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        return t.doubleValue() / x.doubleValue();
    }
    public static <T extends Number, X extends Number> double subtract(T t, X x) {
        return t.doubleValue() - x.doubleValue();
    }

}
