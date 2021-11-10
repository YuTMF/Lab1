package Lab2;

import java.util.Scanner;

public class example09_03 {

    static String ALL_RIGHT_RESULT = "Введенное число полностью удовлетворяет критериям задачи";
    static String PARTLY_RIGHT_RESULT = "Введенное число частично удовлетворяет критериям задачи";
    static String FALSE_RESULT = "Введенное число полностью не удовлетворяет критериям задачи";

    /*
    TODO:3. Напишите программу, которая проверяет, удовлетворяет ли введенное
     пользователем число следующим критериям: число делится на 4, и при
     этом оно не меньше 10
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var answ = in.nextLine();
while ( answ.equals("y")) {
    System.out.print("Задание" +
            "\nПроверить удовлетворяет ли введенное число критериям:" +
            "\n1) делится на 4(четыре)" +
            "\n2) не меньше 10(десяти)" +
            "\nВведите целое число число: ");
    float gettedNumber = in.nextFloat();

    var resRule1 = gettedNumber % 4 == 0 ;
    var resRule2 = gettedNumber >= 10 ;

    if (resRule1 != resRule2)
        System.out.println(PARTLY_RIGHT_RESULT);
    else
    if (!resRule1)
        System.out.println(FALSE_RESULT);
    else
    {System.out.println(ALL_RIGHT_RESULT);}

}


    }
}
