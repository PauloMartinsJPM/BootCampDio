package br.com.dio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Passagem {

    private int id;
    private String origem;
    private String destino;
    private BigDecimal preco;
    private LocalDateTime partida;
    private LocalDateTime chegada;

    public Passagem(){}

        public Passagem(int id, String origem, String destino, BigDecimal preco, LocalDateTime partida, LocalDateTime chegada) {
                this.id = id;
                this.origem = origem;
                this.destino = destino;
                this.preco = preco;
                this.partida = partida;
                this.chegada = chegada;
        }

        public int getId() {
                return id;
        }

        protected void setId(int id) {
                this.id = id;
        }

        public String getOrigem() {
                return origem;
        }

        protected void setOrigem(String origem) {
                this.origem = origem;
        }

        public String getDestino() {
                return destino;
        }

        protected void setDestino(String destino) {
                this.destino = destino;
        }

        public BigDecimal getPreco() {
                return preco;
        }

        protected void setPreco(BigDecimal preco) {
                this.preco = preco;
        }

        public LocalDateTime getPartida() {
                return partida;
        }

        protected void setPartida(LocalDateTime partida) {
                this.partida = partida;
        }

        public LocalDateTime getChegada() {
                return chegada;
        }

        protected void setChegada(LocalDateTime chegada) {
                this.chegada = chegada;
        }

        public void cancelarPassagem(){
            System.out.println("Passagem Cancelada");
        }

        public void remarcarPassagem (){
            System.out.println("Sua passagem foi remarcada");
        }
}
