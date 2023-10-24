package n1exercici5;

public class Main {
    public static void main(String[] args) {
        IGetValue piValueProvider = () -> 3.1415;

        System.out.println("Valor de Pi: " + piValueProvider.getPiValue());
    }

}
