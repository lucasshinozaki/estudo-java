package academy.devdojo.estudojava.javacore.Xserializacao.test;

import academy.devdojo.estudojava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Lucas Alberto Shinozaki", "123412121");
//        serializar(aluno1);
        deserializar();
    }

    //Salvar
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/alunos.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/alunos.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
