package academy.devdojo.estudojava.javacore.Hherancao.test;

import academy.devdojo.estudojava.javacore.Hherancao.dominio.Funcionario;

public class HerancaTest02 {
    /* 0 - Bloco de inicialização estático da super classe é executada quando a JVM carregar a classe pai
       1 - Bloco de inicialização estática da sub classe é executada quando a JVM carregar a classe filha
       2 - Alocado espaço em memória para objeto da superclasse
       3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai
       4 - Bloco de inicialização da superclasse é executado na ordem que aparece
       5 - Construtor é executado da superclasse
       6 - Alocado espaço em memória pro objeto da subclasse
       7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
       8 - Bloco de inicialização da subclasse é executada na ordem que aparece
       9 - Construtor é executado da subclasse
    * */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
