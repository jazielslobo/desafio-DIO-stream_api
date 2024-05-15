package desafio;

import java.util.*;

public class Desafio01 {

//    Desafio 1 - Mostre a lista na ordem numérica:
//    Crie um programa que utilize a Stream API para ordenar
//    a lista de números em ordem crescente e a exiba no console.
//
    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        numerosOrdenados.forEach(System.out::println);
    }
}
