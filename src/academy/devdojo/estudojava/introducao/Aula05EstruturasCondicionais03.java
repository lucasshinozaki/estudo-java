package academy.devdojo.estudojava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se o salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar dinheiro";
        String mensaagemNaoDoar = "Ainda não tenho condição, mas vou ter";
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar: mensaagemNaoDoar;

        System.out.println(resultado);
    }
}
