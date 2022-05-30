package Lab3;
/*
TODO Напишите программу, которая выводит последовательность чисел
 Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое следующее число
 равно сумме двух предыдущих (получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
 Количество чисел в последовательности вводится пользователем.
 Предложите версии программы, использующие разные операторы цикла.
 */

import java.util.Scanner;

public class example09_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности чисел Фибоначчи: ");
        int Fib = sc.nextInt();
        int[] f = new int[Fib];
        f[0] = 1;
        f[1] = 1;
        System.out.print("Через цикл for \n");
        System.out.println(f[0]);
        System.out.println(f[1]);

        int n;
        for(n = 2; n < Fib; ++n) {
            f[n] = f[n - 1] + f[n - 2];
            System.out.println(f[n]);
        }

        System.out.print("Через цикл while \n");
        System.out.println(f[0]);
        System.out.println(f[1]);

        for(n = 2; n < Fib; ++n) {
            f[n] = f[n - 1] + f[n - 2];
            System.out.println(f[n]);
        }

    }
}
