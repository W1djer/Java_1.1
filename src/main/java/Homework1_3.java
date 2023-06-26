import java.util.Scanner;

/**
 Реализовать простой калькулятор
 */

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char znak = scanner.next().charAt(0);
        double res = 0;
        switch(znak) {
            case '+': res = x + y;
                break;
            case '-': res = x - y;
                break;
            case '*': res = x * y;
                break;
            case '/': res = x / y;
                break;
        }
        System.out.println("Ответ: " + res);
    }
}
