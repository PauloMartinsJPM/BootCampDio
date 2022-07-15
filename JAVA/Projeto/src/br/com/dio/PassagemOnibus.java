package br.com.dio;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class PassagemOnibus  extends Passagem{
    private int numeroAssento;

    public PassagemOnibus(){}

    public PassagemOnibus(int id, String origem, String destino, BigDecimal preco, LocalDateTime partida, LocalDateTime chegada, int numeroAssento) {
        super(id, origem, destino, preco, partida, chegada);
        this.numeroAssento = numeroAssento;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    @Override

    public void cancelarPassagem(){
        Duration d = Duration.between(LocalDateTime.now(),getPartida());
        Long days = d.toDays();
        if( days > 30){
            super.cancelarPassagem();;
        }else {
            System.out.println("Passagem não pode ser cancelada");
        }
    }
}
