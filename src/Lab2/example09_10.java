package Lab2;

import java.util.Scanner;

public class example09_10 {
    /*
    TODO: 10. Напишите программу, которая проверяет вторую справа цифру в
     восьмеричном представлении числа, введенного пользователем. Число
     водится в десятичном (обычном) представлении.

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var answ = "y";
        while ( answ.equals("y")) {
            System.out.print("Задание" +
                    "\nОпределить вторую справа цифру в восьмиричном представлении введенного числа" +
                    "\nПримечание: число вводится в десятичном представлении!" +
                    "\nВведите целое число число: ");

            int gettedNumber = in.nextInt();
            if (gettedNumber >8)
            {
                String res = Integer.toOctalString(gettedNumber);
                System.out.printf("Введено число %d" +
                        "\nЕго восьмиричное представление %s" +
                        "\nВторая слева цифра восьмиричного представления числа %d : %s\n"
                        ,gettedNumber, res, gettedNumber, res.charAt(res.length()-1));
            }
            else
                System.out.println("В введеном числе нет второй цифры\n");

        }
    }

}
