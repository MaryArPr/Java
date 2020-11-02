import java.util.Scanner;

public class task12 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАНИЕ:Удаление всех пробелов в заданном тексте.");
        System.out.println("Произвести ввод строки с клавиатуры:");
        String text = input.nextLine();


        System.out.println("Введенная строка без пробелов");
        System.out.println(text.replaceAll("\\s", ""));

    }

}
