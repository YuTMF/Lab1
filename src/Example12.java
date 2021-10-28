import java.util.Calendar;
import java.util.Scanner;

public class Example12 {

    /*TODO: 5. Напишите программу, в которой по году рождения определяется возраст пользователя.  */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Введите год Вашего рождения: ");

        int birthYear = in.nextInt();

        System.out.printf("Текущий год: %d \nВаш возраст: %d", currentYear, currentYear - birthYear);
        in.close();

    }
}
