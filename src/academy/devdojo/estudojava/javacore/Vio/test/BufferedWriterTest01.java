package academy.devdojo.estudojava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Escrevendo dentro do arquivo");
            bw.newLine();
            bw.write("Continuando escrevendo na prox linha");
            bw.newLine();
            bw.flush(); //já chama o fw.close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
