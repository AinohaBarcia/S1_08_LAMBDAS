package n1exercici2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<String> nameList= Arrays.asList("Emma","Carlos","Olga","Marco","Luis","Alicia","Carla","oscar");

        List<String> resultado = filtrarCadenas(nameList);
        System.out.println(resultado);


    }
    public static List<String> filtrarCadenas(List<String> nameList) {
        return nameList.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());


    }
}
