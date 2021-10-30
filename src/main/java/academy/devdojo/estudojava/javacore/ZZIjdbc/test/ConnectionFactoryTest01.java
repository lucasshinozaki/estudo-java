package academy.devdojo.estudojava.javacore.ZZIjdbc.test;

import academy.devdojo.estudojava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
    }
}
