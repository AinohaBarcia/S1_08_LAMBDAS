package n1exercici6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<String> list = Arrays.asList("Emma", "6", "35", "Hello", "world", "90", "Supercalifragilistico", "0", "Paraguas");

            list.stream()
                    .sorted(Comparator.comparing(String::length))
                    .forEach(System.out::println);
        }
    }

