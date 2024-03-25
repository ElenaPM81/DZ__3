package lesson3.task1;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
// sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
// Методы должны возвращать результат своей работы.


public class Main {
    public static void main(String[] args) {

        double a = Calculator.sum(30, 0.4);
        double b = Calculator.multiply(23,5.4);
        double c = Calculator.divide(40,0.1);
        double d = Calculator.subtract(20, 1.2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}