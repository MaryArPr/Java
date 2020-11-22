//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Кол-во рублей = ");
        double rub = input.nextDouble();
        System.out.println("Курс доллара = ");
        double rate = input.nextDouble();   //.nextInt();
        double total = rub / rate;
        System.out.printf("На сумму %.2f₽ по курсу %.2f можно купить %.2f$", rub, rate, total);
    }
}
