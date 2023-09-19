package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Desafio 2
// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/

public class Desafio2 {
    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        long dataHoraEntrada = new Scanner(System.in).nextLong();

        System.out.println(dateFormat.format(new Date(dataHoraEntrada*1000)));
    }
}
