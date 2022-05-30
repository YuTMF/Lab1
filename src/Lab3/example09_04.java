package Lab3;

/*
TODO Напишите программу, в которой пользователем вводится два целых числа.
  Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
   и заканчивая наибольшим (из двух введенных чисел).
   Предложите разные версии программы (с использованием разных операторов цикла).
 */

import java.util.Scanner;


public class example09_04 {
    public static void VariantA(int maxNumb, int minNumber){

        for (int i = minNumber; i <= maxNumb; ++i) {
            System.out.print(i +"; ");
        }
    }

    public static void VariantB(int maxNumber, int minNumber){
        var i = minNumber;
        while (i <= maxNumber){
            System.out.print(minNumber +"; ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое наименьшее число:");
        int a = sc.nextInt();
        System.out.println("Введите второе наибольшее число:");
        int b = sc.nextInt();

          System.out.print("Цикл for\n");
            if (a < b) VariantA(b, a);
            else       VariantA(a, b);

            System.out.println("Цикл while:\n");
            if (a < b) VariantB(b, a);
            else       VariantB(a, b);


    }
}