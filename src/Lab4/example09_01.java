package Lab4;

/*
TODO Напишите программу, которая выводить в консольное окно
 прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11 строк;
 */

public class example09_01 {
    public static void main(String[] args) {
        int width = 22;
        int height = 10;
        char widBorder = '_';
        char heightBorder = '|';

        for(int i = 0; i <= height; i++) {

           for (int j= 0; j <=width; j++) {
               if (i == 0 || i == height) System.out.print(widBorder);
               else  if (j==0 || j == width ) System.out.print(heightBorder);
                   else System.out.print(" ");
           }
           System.out.println("");
        }

    }

}
