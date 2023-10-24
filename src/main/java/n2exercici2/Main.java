package n2exercici2;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    List<Integer> listNumbers = List.of(4,43,6,988,5,22,34,7,56,8,83);

        System.out.println(isEven(listNumbers));

}

    public static String isEven (List<Integer> listNumbers) {
        return listNumbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}