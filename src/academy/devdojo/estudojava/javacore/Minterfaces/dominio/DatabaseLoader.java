package academy.devdojo.estudojava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de addos");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }

    public static void retrieveMacDataSize(){
        System.out.println("Dentro da retrieveMacDataSize na classe DataLoader");
    }
}
