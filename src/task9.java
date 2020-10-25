import java.util.Scanner;

public class task9 {
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

        //вывод массива на экран, где каждый элемент массива умножается на 2
        for (int i = 0; i < size; i++) {
            System.out.printf ("%s элемент массива умноженный на 2 = %s\n" , i+1, array[i] * 2);
        }
    }
}
