package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    /*
        Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
         e exiba o resultado no console.
     */
    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if (numeros.stream().distinct().toList().equals(numeros)) {
            numeros.stream().distinct().forEach(System.out::println);
        }else {
            System.out.println("A lista possui elementos duplicados.");
        }
    }
}
