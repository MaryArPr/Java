/*Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 для перевода числа из одной системы счисления в другую. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task19 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите бинарное число");
        String str = reader.readLine();
        int sum = 0, a;
        int c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод! вводить можно только 1 или 0");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println(str + "->" +  sum);
    }
}
