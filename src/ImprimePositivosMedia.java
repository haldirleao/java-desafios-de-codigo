/* DESAFIO Leia 6 valores.Em seguida,mostre quantos destes valores digitados
 foram positivos.Na próxima linha,deve-se mostrar a média de todos os valores
positivos digitados,com um dígito após o ponto decimal.

ENTRADA
A entrada contém 6 números que podem ser valores inteiros(int)ou de ponto 
flutuante(float ou double).Pelo menos um destes números será positivo.

SAÍDA O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.
 */

import java.io.IOException;
import java.util.Scanner;

public class ImprimePositivosMedia {

    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            int cont = 0;
            double media = 0;
            double x = 0.0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Digite o " + i + "o. número: ");
                double num = leitor.nextDouble();

                if (num > 0) {
                    cont++;
                    x += num;
                }
            }
            media = x / cont;
            System.out.println(cont + " valores positivos");

            System.out.println(String.format("%.1f", media));
        }
    }
}
