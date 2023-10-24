package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nameList= Arrays.asList("Emma","Carlos","Olga","Bruno","Luis","Alicia","Carla","Oscar");

        nameList.stream().filter(name-> name.contains("o")).forEach(System.out::println);


    }
}
