package academy.devdojo.estudojava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    int cont;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        //Pegando arquivos .java, retirando o if mostra todos os arq
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(cont + " - " + file.getFileName());
            cont += 1;
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        //Imprimindo todos os arquivos
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
