package academy.devdojo.estudojava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferWriter
//BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Escrevendo dentro do arquivo\nContinuando escrevendo na prox linha\n");
            fw.flush(); //já chama o fw.close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
