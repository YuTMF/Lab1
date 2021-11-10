package Lab2;

import java.util.Scanner;

public class example09_02 {

    static String ALL_RIGHT_RESULT = "Введенное число полностью удовлетворяет критериям задачи";
    static String PARTLY_RIGHT_RESULT = "Введенное число частично удовлетворяет критериям задачи";
    static String FALSE_RESULT = "Введенное число полностью не удовлетворяет критериям задачи";

    /*
    TODO:2. Напишите программу, которая проверяет, удовлетворяет ли введенное
     пользователем число следующим критериям: при делении на 5 в остатке
     получается 2, а при делении на 7 в остатке получается 1
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Задание" +
                "\nПроверить удовлетворяет ли введенное число критериям:" +
                "\n1) при делении на 5(пять) в остатке 2(два)" +
                "\n2) при делении на 7(семь) в остатке 1(один)" +
                "\nВведите целое число число: ");
        float gettedNumber = in.nextFloat();

        var resRule1 = gettedNumber % 5 == 2 ;
        var resRule2 = gettedNumber % 7 == 1 ;

        if (resRule1 != resRule2)
            System.out.println(PARTLY_RIGHT_RESULT);
        else
            if (!resRule1)
                System.out.println(FALSE_RESULT);
            else
                System.out.println(ALL_RIGHT_RESULT);

    }
}
