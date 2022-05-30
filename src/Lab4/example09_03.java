package Lab4;
/*
TODO Напишите программу, в которой создается двумерный массив,
 который выводи прямоугольник из цифр 2;
 */
public class example09_03 {
    public static void main(String[] args) {

        int height = 9;
        int width = 9;

        for(int i = 0; i <= height; ++i) {
            for(int j = 0; j <= width; ++j) {
                if (j == 0) System.out.print("2");
                if (j == i && i != 0) System.out.print("2");
                else if (i == height) System.out.print("2");
                else System.out.print(" ");

            }

            System.out.println();
        }

    }
}
