package Lab1;

import java.util.Scanner;

public class Example17 {
    /*TODO: 10. Напишите программу, в которой Пользователь вводит два числа, а
       программой вычисляется и отображается сумма и разность этих чисел.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Задание: вычислить сумму и разность двух чисел\nВведите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.printf("Сумма введенных чисел: %d" +
                "\nРАзность введенных чисел: %d"
                , num1 + num2
                , num1 - num2
        );
        in.close();
    }
}
