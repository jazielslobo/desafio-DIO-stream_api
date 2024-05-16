package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    /*
    Desafio 18 - Verifique se todos os números da lista são iguais:
    Utilizando a Stream API, verifique se todos os números da lista são iguais
    e exiba o resultado no console.
     */

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if (numeros.isEmpty()) {
            System.out.println("Lista vazia");
        } else if (numeros.stream().allMatch(n -> n.equals(numeros.get(0)))) {
            System.out.println("Todos os números são iguais");
        } else {
            System.out.println("A lista possui números diferentes");
        }
    }
}
