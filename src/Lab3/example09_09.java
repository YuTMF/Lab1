package Lab3;

/*
TODO Напишите программу, в которой создается массив n заполняется случайными числами.
  Массив отображается в консольном окне. В этом массиве необходимо определить элемент
  с минимальным значением. В частности, программа должна вывести значение элемента с минимальным
  значением и индекс этого элемента. Если элементов с минимальным значением несколько,
  должны быть выведены индексы всех этих элементов.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example09_09 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен " + Size);
        int[] nums = new int[Size];
        Random random = new Random();

        int i;
        for(i = 0; i < nums.length; ++i) {
            nums[i] = random.nextInt(20);
            System.out.print(nums[i] +"\t");
        }
        var minElement = Collections.min(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        System.out.println("\nMin: " + minElement);

        for(i = 0; i < nums.length; ++i) {
            if (nums[i] == minElement)
            System.out.println("Индексы минимального значения [" + i + "]");
        }

    }
}
