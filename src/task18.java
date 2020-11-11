import java.io.FileReader;
import java.io.IOException;

/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
import java.io.*;

public class task18 {
    public static void main(String[] args) {

        int lineNumber = 0;

        try {
                FileReader fileReader = new FileReader("rewritefile.txt");
                LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                while (lineNumberReader.readLine() != null){
                    lineNumber++;
                }
                lineNumberReader.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("rewritefile.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            String str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("\nОстановка ввода - кол-во строк равное %s\n", lineNumber);


            int newlineNumber = 0;

            try (FileWriter writer = new FileWriter("rewritefile.txt", false))
            {
                do {
                    System.out.print("-> ");
                    str = br.readLine();

                    str = str + "\r\n";
                    newlineNumber++;
                    writer.write(str);
                    if (newlineNumber == lineNumber) break;
                } while (newlineNumber != lineNumber);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}