import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для перемножения: ");
        int multi = in.nextInt();

        System.out.printf("1 * %s = %d \n", multi, multi * 1);
        System.out.printf("2 * %s = %d \n", multi, multi * 2);
        System.out.printf("3 * %s = %d \n", multi, multi * 3);
        System.out.printf("4 * %s = %d \n", multi, multi * 4);
        System.out.printf("5 * %s = %d \n", multi, multi * 5);
        System.out.printf("6 * %s = %d \n", multi, multi * 6);
        System.out.printf("7 * %s = %d \n", multi, multi * 7);
        System.out.printf("8 * %s = %d \n", multi, multi * 8);
        System.out.printf("9 * %s = %d \n", multi, multi * 9);
        System.out.printf("10 * %s = %d \n", multi, multi * 10);
    }
}
