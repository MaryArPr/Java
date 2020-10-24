import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три числа x, y, z \n");

        System.out.print("Введите число x:");
        float x = in.nextInt();
        System.out.print("Введите число y:");
        float y = in.nextInt();
        System.out.print("Введите число z:");
        float z = in.nextInt();

        float result = (x + y + z) / 3;
        float result2 = result / 2;

        System.out.printf("Среднее арифметическое = %.2f\n",  result);
        System.out.printf("Деление среднего арифметического на 2  = %.0f\n",  Math.floor(result2));

        if(result2>3) {
            System.out.println("Программа выполнена корректно");
        }

//
    }
}
