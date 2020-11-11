/*Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.*/

import java.util.Scanner;
import java.io.*;

public class task17 {
    public static void main(String[] args) {

        String str;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Остановка ввода в консоль - фраза стоп");


        try (FileWriter writer = new FileWriter("filewrite.txt", false))
        {
            do {
                System.out.print("-> ");
                str = br.readLine();

                if (str.compareTo("стоп") == 0) break;

                str = str + "\r\n";
                writer.write(str);
            } while (str.compareTo("стоп") != 0);

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
