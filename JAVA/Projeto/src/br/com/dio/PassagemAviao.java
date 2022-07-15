package br.com.dio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PassagemAviao extends Passagem{
    private int classe;
    private int numeroAssento;
    private int escala;

    public PassagemAviao(){}

    public PassagemAviao(int id, String origem, String destino, BigDecimal preco, LocalDateTime partida, LocalDateTime chegada, int classe, int numeroAssento, int escala) {
        super(id, origem, destino, preco, partida, chegada);
        this.classe = classe;
        this.numeroAssento = numeroAssento;
        this.escala = escala;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    @Override

    public void remarcarPassagem(){
        if (getId() > 0) {
            System.out.println("Sua passagem será remarcada");
        }else{
            System.out.println("Sua passagem é invalida");
        }
    }
}
