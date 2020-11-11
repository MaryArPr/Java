import java.util.Scanner;

public class task15 {
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

        System.out.printf("\nМассив до сортировки.\n");
        for (int i = 0; i < size; i++) {
            System.out.printf ("[%s]", array[i]);
        }

        for (int i = array.length-1 ; i > 0 ; i--)
        {
            for (int j = 0 ; j < i ; j++)
            {

                if (array[j] > array[j+1])
                {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.printf("\nМассив после сортировки.\n");
        for (int i = 0; i < size; i++) {
            System.out.printf ("[%s]", array[i]);
        }

    }
}
