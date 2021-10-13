package academy.devdojo.estudojava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/shinozaki/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize()); //Arrumou o Path, não significa que existe
        Path path2 = Paths.get("/home/./shinozaki/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
