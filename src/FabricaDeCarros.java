/* DESAFIO
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem 
do distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja 
de carros gostaria de um programa para calcular o preço de um carro novo para os clientes.
Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos 
e deverá escrever programa para ler esses valores e imprimir o valor final do carro.

ENTRADA
Você recebera três valores inteiros que representam o custo de fábrica,
as porcentagens do distribuidor e os impostos.

SAÍDA
Como saída, teremos o valor final do preço de um carro novo. */

import java.util.*;

public class FabricaDeCarros {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Custo de fábrica : ");
            int custoFabrica = scan.nextInt();
            System.out.println("Porcentagem do distribuidor: ");
            int porcentagemDistribuidor = scan.nextInt();
            System.out.println("Porcentagem de impostos: ");
            int percentualImpostos = scan.nextInt();

            int custoConsumidor;
            int valorDistribuidor;
            int valorImpostos;

            valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            valorImpostos = (custoFabrica * percentualImpostos) / 100;
            custoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;

            System.out.println("Custo final consumidor: ");
            System.out.println(custoConsumidor);
        }
    }
}