package Lab1;

import java.util.Scanner;

public class Example10 {
    /*TODO: 3. Напишите программу, в которой Пользователь последовательно вводит
           название текущего дня недели, название месяца и дату (номер дня в месяце).
               Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String dayWeek = in.nextLine();

        System.out.print("Введите дату(день месяца): ");
        String dayMonth = in.nextLine();

        System.out.print("Введите название месяца: ");
        String currentMonth = in.nextLine();

        System.out.printf("Сегодняшняя дата: %s %s %s", dayWeek, dayMonth, currentMonth);
        in.close();

    }
}
