package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {

    public static void main(String[] args) {
        // Desafio 3 - Verifique se todos os números da lista são positivos:
        //  Com a ajuda da Stream API, verifique se todos os números da lista são positivos e
        //  exiba o resultado no console.

        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // allMatch(Predicate<T> predicate):
        // Verifica se todos os elementos da Stream atendem ao predicado especificado.
        // Exemplo: stream.allMatch(n -> n > 0)

        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);

        // Imprimir o resultado da soma
        if (todosPositivos) {
            System.out.println("Todos os números da lista são positivos.");
        } else {
            System.out.println("Pelo menos um número da lista não é positivo.");
        }
    }
}