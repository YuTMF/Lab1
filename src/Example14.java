import java.util.Calendar;
import java.util.Scanner;

public class Example14 {
    /*TODO: 7. Напишите программу, в которой по возрасту определяется год рождения.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Введите Ваш возраст: ");
        int age = in.nextInt();

        System.out.printf("Текущий год: %d \nГод Вашего рождения: %d", currentYear, currentYear - age);
        in.close();
    }
}
