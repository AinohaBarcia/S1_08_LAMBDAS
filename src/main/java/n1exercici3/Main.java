package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> monthsList= Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","Dcember");

        monthsList.forEach((name) -> System.out.println(name));
    }
}
