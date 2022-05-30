package Lab3;

/*
TODO Напишите программу, в которой создается символьный массив из 10 элементов.
 Массив заполнить большими (прописными) буквами английского алфавита.
 Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А ' , 'Е ' и ' I '
 при присваивании значений элементам массива нужно пропустить).
  Отобразите содержимое созданного массива в консольном окне.
 */

public class example09_08 {

    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';

        for(int i = 0; i < n; ++i) {
            Boolean Pass = true;

            for(int j = 0; j < vowels.length; ++j) {
                if (b == vowels[j]) {
                    --i;
                    Pass = false;
                    break;
                }
            }

            if (Pass) {
                charArray[i] = b;
            }
            ++b;
        }

        for(int k = 0; k < n; ++k) {
            System.out.print(charArray[k] + "\t");
        }

    }
}
