package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio05 {

    //    Desafio 5 - Calcule a média dos números maiores que 5:
    //    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .filter(n -> (n > 5))
                .mapToDouble(n -> n)
                .average();

        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("não existe número maior que 5 na lista");
        }
    }
}
