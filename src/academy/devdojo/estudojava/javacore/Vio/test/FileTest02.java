package academy.devdojo.estudojava.javacore.Vio.test;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) throws Exception {
        //Criando diretorio
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Pasta criada ? " + isDiretorioCriado);

        //Criando arquivo
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado ? " + isFileCreated);

        //Renomeadno arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado ? " + isRenamed);

        //Renomeado diretorio
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado ? " + isDiretorioRenomeado);
    }
}
