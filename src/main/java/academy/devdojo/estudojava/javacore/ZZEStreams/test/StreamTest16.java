package academy.devdojo.estudojava.javacore.ZZEStreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    // Cuidado com a performace
    // Benchmark
    // Unboxing | boxing
    // Não fazer com parallel (limit, findFirst) Bom com parallel findAny
    // Custo total da computação N, P
    // Quantidade de dados, se for muito pequeno não vale a pena
    // Tipos de coleções, dar uma pesquisada antes de usar
    // Tamanho do stream (tamanho já definido é melhor para se usar)
    // Processamento merge
    //    if(tarefa for pequena e não pode ser dividida){
    //        faz sequencialmente
    //    else{
    //        divide em duas tarefas
    //        chama o metodo recursivamente
    //        espea todas as tarefas serem completadas
    //        Combinas o resultado
    //    }
    //  }

}
