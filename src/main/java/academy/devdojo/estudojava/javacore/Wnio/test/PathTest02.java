package academy.devdojo.estudojava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Criando um diretorio
        Path pastaPath = Paths.get("pasta2");
        if(Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        //Criando uns subDiretorio
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        //Criando um arquivo no subDiretorio
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        //Fazendo uma copia de outro arquivo
        Path source = filePath; //Origem
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
