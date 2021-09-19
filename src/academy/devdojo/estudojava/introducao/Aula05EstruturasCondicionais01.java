package academy.devdojo.estudojava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcóolica");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c == true) {
            System.out.println("Dentre de algo que nuvca deve ser feito");
        }

        System.out.println("Fora do if");

    }
}
