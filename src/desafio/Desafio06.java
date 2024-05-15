package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    /*
        Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Utilize a Stream API para verificar se a lista contém algum número maior que 10
        e exiba o resultado no console.
     */
    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // x é o número a pesquisar
        int x = 10;

        List<Integer> numerosMaiorqueX = numeros.stream().filter( n-> n>x ).toList();
        if (numerosMaiorqueX.isEmpty()){
            System.out.println("Não existem números maior que " + x);
        } else {
            System.out.println("Lista dos números encontrados maior que " + x);
            numerosMaiorqueX.forEach(System.out::println);
        }
    }

}
