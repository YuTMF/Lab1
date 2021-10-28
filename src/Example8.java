import java.util.Scanner;

public class Example8 {
    /*TODO: 1. Напишите программу, в которой Пользователь вводит сначала фамилию,
        затем имя, затем отчество. После ввода программа выводит сообщение «Hallo
        <ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО>».
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.print("Введите отчество: ");
        String secondName = in.nextLine();

        System.out.printf("Hallo, %s %s %s\n", surname, name, secondName);

    }

}
