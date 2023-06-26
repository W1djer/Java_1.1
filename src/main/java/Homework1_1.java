import java.util.Scanner;
/**
 Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

public class Homework1_1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = enter.nextInt();
        System.out.println("Треугольное: " + triangle(N));
        System.out.println("Факториал: " + fact(N));
    }
    static int triangle(int x){
        if (x == 1) return 1;
        return (x + triangle(x-1));
    }
    static int fact(int x){
        if (x == 0) return 1;
        return (x * fact(x-1));
    }
}