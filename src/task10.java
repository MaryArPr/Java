import java.util.Scanner;

    public class task10 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Введите кол-во элементов в матрице [строк][столбцов]: ");
            int sizea = input.nextInt(); //строк
            int sizeb = input.nextInt(); //столбцов
            int matrix[][] = new int[sizea][sizeb];


            for (int i = 0; i < sizea; i++) {
                for (int j = 0; j < sizeb; j++) {
                    System.out.printf("Добавьте элемент  [строка %s][столбец %s]\n", i + 1, j+1);
                    matrix[i][j] = input.nextInt();
                }
            }

            // вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
            for (int i = 0; i < sizeb; i++) {
                System.out.printf ("%s элемент массива умноженный на 3 = %s\n" , i+1, matrix[0][i] * 3);
            }
    }
}
