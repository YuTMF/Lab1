package Lab3;

/*
TODO Напишите программу, в которой вычисляется сумма чисел,
 удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
  или при делении на 3 в остатке получается 1 Количество чисел в сумме вводится пользователем.
  Программа отображает числа, которые суммируются, и значение суммы. Предложите версии программы,
  использующие разные операторы цикла.
 */

import java.util.Scanner;

public class example09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество чисел в сумме: ");
        int sum1 = sc.nextInt();
        int i = 1;
        int sum2 = 0;

        while(i <= sum1) {
            for(int numb = 1; i <= sum1; ++numb) {
                if (numb % 5 == 2 && numb % 3 == 1) {
                    System.out.printf("Подходящее число: %d \n", numb);
                    sum2 += numb;
                    ++i;
                }
            }
        }

        System.out.printf("Сумма чисел: %d \n", sum2);
    }
}
