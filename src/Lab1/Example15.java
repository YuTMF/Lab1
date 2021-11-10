package Lab1;

import java.util.Calendar;
import java.util.Scanner;

public class Example15 {

    /*TODO: 8. Напишите программу для вычисления суммы двух чисел. Оба числа
       вводятся пользователем. Для вычисления суммы используйте оператор +.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Задание: вычислить сумму двух чисел\nВведите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.printf("Сумма введенных чисел: %d", num1 + num2);
        in.close();
    }
}
