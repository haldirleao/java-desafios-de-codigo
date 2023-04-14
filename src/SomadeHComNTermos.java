/* Desafio
Neste desafio, faça um programa que calcule o valor de H com N termos. 

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
(Série Harmônica de N termos)

Entrada 
A entrada consiste em um número inteiro positivo. 

Saída 
Na saída será impresso o valor que representa a soma dos termos.
 */

import java.util.Scanner;

public class SomadeHComNTermos {

    public static void main(String[] Args) {

        double h = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
            for (int i = 1; i <= n; i++) {
                h += 1 / (double) i; // necessário fazer o cast senão a divisão não é correta.
            }
        }
        // DIO: Imprima a soma dos termos, considerando um resultado com duas casas
        // decimais:
        // LEAOH: O comentário acima está errado. O teste espera que se retorne um valor
        // arrendondado e inteiro.
        h = Math.round(h); // arredondando
        System.out.println((int) h); // cast int para ficar Ok nos testes do desafio.
    }
}
