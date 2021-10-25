package academy.devdojo.estudojava.javacore.ZZFthreads.service;

import academy.devdojo.estudojava.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members){
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails....");

        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando emaili para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os email foram enviados com sucesso!");
    }
}
