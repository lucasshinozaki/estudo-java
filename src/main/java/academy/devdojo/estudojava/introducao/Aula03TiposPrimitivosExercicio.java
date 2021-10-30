package academy.devdojo.estudojava.introducao;
/**
 Prática:

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Alguma rua";
        double salario = 2000;
        String data = "20/05/2021";

        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salario de "+salario+", na data "+data;

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salario de "+salario+", na data "+data);
        System.out.println(relatorio);
    }
}
