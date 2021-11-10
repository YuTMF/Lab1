package Lab2;

import java.util.Scanner;

public class example09_05 {
    /* TODO: 5. Напишите программу, которая проверяет, сколько тысяч во введенном
        пользователем числе (определяется четвертая цифра справа в десятичном
        представлении числа)
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var answ = "y";
        while ( answ.equals("y")) {
            System.out.print("Задание" +
                    "\nОпределить количество тысяч в введенном числе" +
                    "\nВведите целое число число: ");

            int gettedNumber = in.nextInt();
            if (gettedNumber >999)
                System.out.printf("В введеном числе количество тысяч - %d \n", gettedNumber/1000);
            else
                System.out.println("Введенное число меньше тысячи\n");

        }

    }
}
