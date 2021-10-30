package academy.devdojo.estudojava.javacore.ZZIjdbc.test;

import academy.devdojo.estudojava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.estudojava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
        ProducerRepository.save(producer);
    }
}
