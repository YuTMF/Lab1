package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
TODO Напишите программу, в которой создается целочисленный массив,
 заполняется случайными числами и после этого значения элементов в
 массиве сортируются в порядке убывания значений.
 */

public class example09_10 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен " + Size);
        Integer[] nums = new Integer[Size];
        Random random = new Random();

        int i;
        for(i = 0; i < nums.length; ++i) {
            nums[i] = random.nextInt(200);
            System.out.print(nums[i] +"\t");
        }

        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("\nМассив после сортировки");

        for(i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] +"\t");
        }

    }
}
