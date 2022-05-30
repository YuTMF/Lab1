package Lab3;
import java.util.Scanner;
/*
TODO: Напишите программу, в которой пользователь вводит целое число
 в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
 Если введенное пользователем число выходит за допустимый диапазон,
 выводится сообщение о том, что введено некорректное значение. Используйте
 оператор выбора switch.
 */
public class example09_01 {
    public static boolean CheeckNumber(int numb){
        return numb >0 && numb <8;
    }

    public static String Gen_ResultText(int day){
        switch (day) {
            case 1:  return "понедельник";
            case 2:  return "вторник";
            case 3:  return "среда";
            case 4:  return "четверг";
            case 5:  return "пятница";
            case 6:  return "суббота";
            case 7:  return "воскресенье";
        }

        return "Введено некорректное значение";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var answ = "y";
        do{
            System.out.println("Введите номер дня недели: ");
            int day = sc.nextInt();

            if (CheeckNumber(day))
            System.out.println("Вы ввели " + day +" "+ Gen_ResultText(day));

            System.out.println(day);
        }
        while (answ=="y");

    }

}
