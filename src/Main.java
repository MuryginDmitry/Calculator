public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);// в классе колькулятора добавил условие, которое проверяет, не равен ли b нулю. Если b равен нулю, мы выбрасываем IllegalArgumentException с сообщением division by zero
        calc.println.accept(c);
    }
}