package Lab3;
import java.util.Scanner;
/*
TODO: Напишите программу, в которой пользователю предлагается
        ввести название дня недели. По введенному названию программа определяет
        порядковый номер дня в неделе. Если пользователь вводит неправильное
        название дня, программа выводит сообщение о том, что такого дня нет.
        Предложите версию программы на основе вложенных условных операторов и
        на основе оператора выбора switch.
*/

public class example09_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var answ = "y";

        do {
            System.out.print("Введите день недели с большой буквы: ");

            switch (sc.nextLine()) {
                case "Понедельник":
                    System.out.println("Введено значение \"Понедельник\"" +  "\n его номер 1");
                    break;
                case "Вторник":
                    System.out.println("Вы ввели \"Вторник\"" + "\n его номер 2");
                    break;
                case "Среда":
                    System.out.println("Вы ввели \"Среда\"" +"\n его номер 3");
                    break;
                case "Четверг":
                    System.out.println("Вы ввели \"Четверг\"" + "\n его номер 4");
                    break;
                case "Пятница":
                    System.out.println("Вы ввели \"Пятница\"" + "\n его номер 5");
                    break;
                case "Суббота":
                    System.out.println("Вы ввели \"Суббота\"" +"\n его номер 6");
                    break;
                case "Воскресенье":
                    System.out.println("Вы ввели \"Воскресенье\"" + "\n его номер 7");
                    break;
                default:
                    System.out.println("Такого дня недели нет");
            }

}while (answ == "y");


    }
}
