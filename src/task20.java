//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class task20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.printf("Добавьте %s элемента в массив\n\n", size);
        for (int i = 0; i < size; i++) {
            System.out.printf("Добавьте элемент номер %s\n", i+1);
            array[i] = input.nextInt();
        }

        String intArrayString = Arrays.toString(array);
        System.out.print("Введенный массив = ");
        System.out.println(intArrayString);


        int step = size / 2;
         while (step > 0)
        {
            for (int i = 0; i < (size - step); i++) {
                 int j = i;
                 while (j >= 0 && array[j] > array[j + step])
                {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }

        String intArrayStringSorted = Arrays.toString(array);
        System.out.print("Отсортированный массив = ");
        System.out.println(intArrayStringSorted);

    }
}