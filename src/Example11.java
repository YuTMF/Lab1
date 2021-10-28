import java.util.Scanner;

public class Example11 {

    /*TODO: 4. Напишите программу, в которой пользователю предлагается ввести
       название месяца и количество дней в этом месяце. Программа выводит
       сообщение о том, что соответствующий месяц содержит указанное количество дней.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String currentMonth = in.nextLine();

        System.out.print("Введите количество дней в месяце: ");
        int daysCount = in.nextInt();

        System.out.printf("В месяце %s количество дней составляет %d", currentMonth, daysCount);
        in.close();
    }
}
