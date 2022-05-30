package Lab3;
import java.util.Scanner;

/*
TODO 6 Напишите программу, в которой создается одномерный числовой
 массив и заполняется числами, которые при делении на 5 дают в остатке 2
 (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
 Предусмотреть обработку ошибки, связанной с вводом некорректного
 значения.
 */

public class example09_06 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        if (cs.hasNextInt()) {
            int Size = cs.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен: " + Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;

                while(x < Size) {
                    ++i;
                    if (i % 5 == 2) {
                        nums[x] = i;
                        System.out.println("Элемент массива [" + x + "] = " + nums[x]);
                        ++x;
                    }
                }
            } else {
                System.out.println("некорректное значение");
                cs.next();
            }
        } else {
            System.out.println("некорректное значение");
            cs.next();
        }

    }
}
