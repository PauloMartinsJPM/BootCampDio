package br.com.dio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PassagemOnibus passagemOnibus = new PassagemOnibus(123,"São Paulo","Rio de Janeiro",
                new BigDecimal("200.00"),LocalDateTime.of(2022,7,13,20,00),
                LocalDateTime.of(2022,8,10,20,00),1);

        passagemOnibus.cancelarPassagem();
        System.out.println();
        System.out.println(passagemOnibus);
        System.out.println("ta funcionando");

        PassagemAviao passagemAviao = new PassagemAviao();

    }
}
