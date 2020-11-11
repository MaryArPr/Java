/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt */
import java.io.*;
public class task16 {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("file.txt"))
        {
            System.out.printf("\nЧтение данных из файла \n");

            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}