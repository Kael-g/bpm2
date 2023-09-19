package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Desafio 1
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.

Ordene estes valores de acordo com o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.

- Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

public class Desafio1 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        int numero, quantidade;

        System.out.println("Digite a quantidade de números a serem digitados:");
        for (quantidade = in.nextInt(); quantidade <= 1 || quantidade >= 10000; quantidade = in.nextInt()){
            System.out.println("Quantidade deve ser maior que 1 e menor que 10000");
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println(i+1 + "° número:");
            for (numero = in.nextInt(); numero < 0; numero = in.nextInt()) {
                System.out.println("O número deve ser positivo");
            }
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        impares.sort(Collections.reverseOrder());

        System.out.println("Números ordenados (primeiro pares em ordem crescente e então ímpares em ordem decrescente):");

        for (int n : pares){
            System.out.println(n);
        }

        for (int n : impares){
            System.out.println(n);
        }
    }
}