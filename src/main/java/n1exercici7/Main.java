package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Emma","6","35","Hello","world","90","Supercalifragilistico","0","Paraguas");

        List<String> listaOrdenada = descendantOrder(list);
        listaOrdenada.forEach(System.out::println);

    }
    public static List<String> descendantOrder(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}
