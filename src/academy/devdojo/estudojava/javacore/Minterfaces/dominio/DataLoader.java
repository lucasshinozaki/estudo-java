package academy.devdojo.estudojava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
