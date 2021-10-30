package academy.devdojo.estudojava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigner = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> students = List.of("Lucas", "Édipo", "Gustavo", "Guilherme");
        devdojo.add(graphicDesigner);
        devdojo.add(developers);
        devdojo.add(students);

        //sem steams imprimindo
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        //com stream
        System.out.println("------------");
        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
