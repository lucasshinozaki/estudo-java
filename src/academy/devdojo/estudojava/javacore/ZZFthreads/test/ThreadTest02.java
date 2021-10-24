package academy.devdojo.estudojava.javacore.ZZFthreads.test;

//Recomendado para usar thread
class ThreadExampleRunnable2 implements Runnable{

    private final String c;

    public ThreadExampleRunnable2(String c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++){
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }

            Thread.yield();
        }
    }
}

// Daemon(não tem prioridade) X User
// img -> thread_join
public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
       Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));

       t1.start();
       t1.join();
       t2.start();

    }
}
