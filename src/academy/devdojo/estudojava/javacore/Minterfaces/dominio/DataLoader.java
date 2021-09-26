package academy.devdojo.estudojava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMacDataSize(){
        System.out.println("Dentro da retrieveMacDataSize na interface");
    }

}
