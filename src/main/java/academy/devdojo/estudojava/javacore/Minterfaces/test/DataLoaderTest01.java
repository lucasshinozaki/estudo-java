package academy.devdojo.estudojava.javacore.Minterfaces.test;

import academy.devdojo.estudojava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.estudojava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.estudojava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMacDataSize();
        DatabaseLoader.retrieveMacDataSize();

    }
}
