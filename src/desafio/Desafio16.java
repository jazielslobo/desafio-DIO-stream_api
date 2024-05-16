package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    /*
        Desafio 16 - Agrupe os números em pares e ímpares:
        Utilize a Stream API para agrupar os números em duas listas separadas,
        uma contendo os números pares e outra contendo os números ímpares da lista original,
        e exiba os resultados no console.
     */

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando pares e ímpares em listas separadas.
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números Impares: " + numerosImpares);

        // outra forma que achei, dividindo em partes com um argumento e
        // transformando em um mapa com chave boolean
        Map<Boolean, List<Integer>> agrupados = numeros.stream().
                collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = agrupados.get(true);
        List<Integer> impares = agrupados.get(false);
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);

    }
}
