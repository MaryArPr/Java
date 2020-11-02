import java.util.Scanner;

public class java13 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАНИЕ:Сравнение двух строк.");
        System.out.println("Произвести ввод строки с клавиатуры первой строки:");
        String text = input.nextLine();

        System.out.println("Произвести ввод строки с клавиатуры второй строки:");
        String text1 = input.nextLine();


        for (int i = 1; i <= 50; i++) { //уберем все лишнее из консоли
            System.out.print("\n");
        }

        System.out.println("Выводим строку, которая длинее:");
        if (text.length() > text1.length()) {
            System.out.println(text);
        } else if (text.length() < text1.length()) {
            System.out.println(text1);
        } else {
            System.out.println("Введеные строки одинаковой длины.");
        }
    }
}