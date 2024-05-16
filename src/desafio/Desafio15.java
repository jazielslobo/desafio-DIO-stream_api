package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    /*
     Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
        e exiba o resultado no console.
     */
    public static void main(String[] args) {
        // Lista de números inteiros para todos os desafios
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       if (numeros.stream().filter(n -> n<0).count() == 0){
           System.out.println("A lista não contém valores negativos.");
       }else {
           System.out.println("Os números negativos presentes na lista são:");
                   numeros.stream().filter(n -> n < 0).forEach(System.out::println);
       }
    }
}
