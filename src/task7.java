import java.util.Scanner;
public class task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x =  10;
        int y = 20;
        int z = 30;

        System.out.print("Введите число :");
        int number = in.nextInt();

        if(number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
//