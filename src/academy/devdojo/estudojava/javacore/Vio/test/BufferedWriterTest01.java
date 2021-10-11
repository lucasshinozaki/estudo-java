package academy.devdojo.estudojava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Escrevendo dentro do arquivo");
            br.newLine();
            br.write("Continuando escrevendo na prox linha");
            br.newLine();
            br.flush(); //já chama o fw.close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
