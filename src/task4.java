public class task4 {
    public static void main(String[] args) {

        int a = 1543;
        //Ввести в консоли число в бинарном формате
        System.out.println(Integer.toBinaryString(a));

        //Перевести его в десятичный формат, записать в переменную int
        int i = Integer.parseInt(Integer.toBinaryString(a), 2);
        //вывести на экран
        System.out.println(i);

    }
}