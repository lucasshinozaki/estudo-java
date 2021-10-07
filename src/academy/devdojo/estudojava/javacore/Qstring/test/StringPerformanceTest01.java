package academy.devdojo.estudojava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }

    //micro-desempenho eleva a complexidade do código

    // Tem um gasto maior
    private static void concatString(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 013
        }
    }

    // Utilizada para diminuir o tempo
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i); // 0, 01, 012, 013
        }
    }

    // Criada para utilizar múltiplas threads, usa uma thread por vez
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i); // 0, 01, 012, 013
        }
    }
}
