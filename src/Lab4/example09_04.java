package Lab4;

/*
TODO Напишите программу, в которой создается двумерный массив,
 который выводит прямоугольный треугольник;
 */

public class example09_04 {

    public static void main(String[] args) {

        char heightBorder = '\\';
        char groundBorder = '_';

        int height = 9;
        int width = 9;

        for(int i = 0; i <= height; ++i) {

            for(int j = 0; j <= width; ++j) {

                if (j == 0) System.out.print("|");
                if (j == i) System.out.print(heightBorder);
                else if (i == height) System.out.print(groundBorder);
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
