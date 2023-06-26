/**
 Вывести все простые числа от 1 до 1000
 */

public class Homework1_2 {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder(new String());
        int count = 0;
        for (int i = 2; i < 1000; i++){
            count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0) count++;
            }
            if (count == 2) line.append(" " + i);
        }
        System.out.println(line);
    }
}
