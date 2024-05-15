package desafio;

import java.util.*;
import java.util.stream.*;

public class Desafio04 {

    //    Remova todos os valores ímpares:
    //    Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listPares = numeros.stream()
                .filter(n -> ((n % 2) == 0))
                .collect(Collectors.toList());
        System.out.println(listPares);
    }

}
