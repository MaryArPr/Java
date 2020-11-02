import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:\n");

        String s = input.nextLine();
        int x =  Integer.parseInt(s);
        double y = new Double(x);


        System.out.printf("Тип string:" + s + "\n" + "Тип int:" + x + "\n" + "тип double:" + y);

    }
}
