package Lab2;
import java.util.Scanner;

public class example09_01 {
    /*TODO: 1. Напишите программу, которая проверяет, делится ли введенное
       Пользователем число на 3
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Задание" +
                          "\nПроверить делится ли введенное число на 3(три)" +
                          "\nВведите целое число число: ");
        float gettedNumber = in.nextFloat();

        var res = gettedNumber % 3 != 0 ? "Введенное число не делится на 3 без остатка" : "Введенное число делится на 3 без остатка" ;

        System.out.printf("Результат деления %f на 3(три): %f" +
                "\nОстаток от деления: %f" +
                "\nВывод: %s", gettedNumber, gettedNumber/3, gettedNumber%3, res);
        in.close();

    }
}
