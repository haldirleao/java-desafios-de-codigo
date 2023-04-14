/* 
 * Desafio
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
 * de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
 * soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
 * mostre os N primeiros números dessa série.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 * 
 * Saída
 * Os valores devem ser mostrados na mesma linha, separados por um espaço em
 * branco. Não deve haver espaço após o último valor.
 */

/*Como consegui resolver: 
 *numAnterior2 -- numAnterior1 -- numAtual
 *                 numAnterior2 -- numAnterior1 -- numAtual
 *                                 numAnterior2 -- numAnterior1 -- numAtual
 * 
 * Logo: a cada loop:
 * numAnterior2 = numAnterior1
 * numAnterior1 = numAtual
 * numAtual = numAnterior1 + numAnterior2
 */

import java.io.IOException;
import java.util.Scanner;

public class FibonacciFacil {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt(); // (0 < N < 46)

        int numAtual = 0;
        int numAnterior1 = 1;
        int numAnterior2 = 0;

        for (int i = 1; i <= N; i++) {
            if (i == N)
                System.out.println(numAtual);
            else {
                System.out.print(numAtual + " ");
                numAnterior2 = numAnterior1;
                numAnterior1 = numAtual;
                numAtual = numAnterior1 + numAnterior2;
            }
        }

    }

}