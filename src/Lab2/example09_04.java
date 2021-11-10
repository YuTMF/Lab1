package Lab2;

import java.util.Scanner;

public class example09_04 {
    /*TODO: 4. Напишите программу, которая проверяет, попадает ли введение
       пользователем число в диапазон от 5 до 10 включительно
     */
    static String ALL_RIGHT_RESULT = "Введенное число полностью удовлетворяет критериям задачи";
    static String FALSE_RESULT = "Введенное число полностью не удовлетворяет критериям задачи";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var answ = in.nextLine();
        while ( answ.equals("y")) {
            System.out.print("Задание" +
                    "\nПроверить удовлетворяет ли введенное число критерию:" +
                    "\nчисло попадает в диапазон от 5 до 10 включительно" +
                    "\nВведите целое число число: ");
            float gettedNumber = in.nextFloat();

            if (gettedNumber >= 5 && gettedNumber <=10)
                System.out.println(ALL_RIGHT_RESULT + "\n");
            else
                System.out.println(FALSE_RESULT + "\n");


        }
    }

}
