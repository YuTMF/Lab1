import java.util.Calendar;
import java.util.Scanner;

public class Example13 {
    /* TODO: 6. Напишите программу, в которой Пользователь вводит имя и год рождения,
        в программа отображает сообщение содержащее имя пользователя и его
        возраст*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Введите Ваше имя: ");
        String userName = in.nextLine();

        System.out.print("Введите год Вашего рождения: ");
        int birthYear = in.nextInt();

        System.out.printf("Текущий год: %d \nПользователь: %s %d", currentYear, userName, currentYear - birthYear);
        in.close();
    }
}
