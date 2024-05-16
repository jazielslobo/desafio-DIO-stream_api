package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    /*
        Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
        (por exemplo, entre 5 e 10) e exiba o resultado no console.
     */

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int iMenor = 5;
        int iMaior = 10;

        List<Integer> listaIntervalo = numeros.stream().filter(n -> n > iMenor && n< iMaior).toList();
        System.out.println(listaIntervalo);
    }


}
