package academy.devdojo.estudojava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LInkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedDeque, SynchronousQueue, LinkedBlockingDeque
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("lucas")); // Retorna o throws, caso erro
        System.out.println(tq.offer("lucas")); // Retorna false caso de erro
        System.out.println(tq.offer("lucas", 10, TimeUnit.SECONDS));
        tq.put("SHinozaki");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Shinozaki");
        }
        System.out.println(tq.tryTransfer("Alberto"));
        System.out.println(tq.tryTransfer("Alberto", 2, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());

    }
}
