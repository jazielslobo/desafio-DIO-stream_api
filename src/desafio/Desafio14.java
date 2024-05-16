package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio14 {
    /*
        Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e
        exiba o resultado no console.
    */

    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                // Usa o método filter para selecionar apenas os números que atendem à condição
                // definida pelo predicado isPrimo
                .filter(Desafio14::isPrimo) // A função Desafio14::isPrimo refere-se ao método isPrimo na classe Desafio14
                // Coleta os números filtrados em uma nova lista
                .collect(Collectors.toList());


        System.out.print("Maior número primo na lista é: " );
        numerosPrimos.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }

    public static boolean isPrimo(int n) {
        // Obtém o valor absoluto do número para garantir que seja positivo
        n = Math.abs(n);

        // Verifica se o número é menor ou igual a 1, caso contrário, não é primo
        if (n <= 1) {
            return false;
        }

        // Faz um loop de 2 até a raiz quadrada do número
        for (int i = 2; i * i <= n; i++) {
            // Se o número for divisível por algum valor no intervalo, não é primo
            if (n % i == 0) {
                return false;
            }
        }

        // Se não foi encontrado divisor no loop, o número é primo
        return true;
    }

}
