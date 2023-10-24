package n1exercici8;

public class Main {
    public static void main(String[] args) {

        IReverse reverser = (word) -> {
            StringBuilder reversed = new StringBuilder(word);
            return reversed.reverse().toString();
        };
        String inputString = "Esternocleidomastoideo";
        String reversedString = reverser.reverse(inputString);

        // Imprimir el resultado
        System.out.println("Cadena original: " + inputString);
        System.out.println("Cadena invertida: " + reversedString);
    }

}
