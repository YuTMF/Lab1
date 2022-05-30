package Lab4;
import java.util.Random;
import java.util.Scanner;

/*
6
Напишите программу,
в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */

public class example09_06 {

    public static void main(String[] args) {
        Random random = new Random(200L);
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] firstArray = new int[a][b];

        int deleteS;
        int deleteK;
        for(deleteS = 0; deleteS < a; ++deleteS) {
            for(deleteK = 0; deleteK < b; ++deleteK) {
                firstArray[deleteS][deleteK] = random.nextInt(200);
                System.out.println("i = " + deleteS + ";j= " + deleteK + ";Число= " + firstArray[deleteS][deleteK]);
            }
        }

        System.out.println("Выбор строки  и столбца для удаления");
        deleteS = random.nextInt(a - 1);
        deleteK = random.nextInt(b - 1);
        System.out.println("Удаленная строка = " + deleteS + ";Удаленный столбец = " + deleteK);
        System.out.println("Получившийся массив");
        int[][] secondArray = new int[a - 1][b - 1];
        int i = 0;

        for(int s = 0; i < a - 1; ++s) {
            if (s != deleteS) {
                int j = 0;

                for(int k = 0; j < b - 1; ++k) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";Число " + secondArray[i][j]);
                        ++j;
                    }
                }

                ++i;
            }
        }

    }
}
