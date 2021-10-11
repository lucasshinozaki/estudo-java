package academy.devdojo.estudojava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
//            char[] in = new char[30]; // lendo o arquivo até uma certa posição
//            fr.read(in);
//            for(char c : in){
//                System.out.print(c);
//            }
            int i;
            while((i = fr.read()) !=-1){ //lendo o arquivo inteiro
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
