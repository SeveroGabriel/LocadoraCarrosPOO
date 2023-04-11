package Basicas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Seguro {
    private int id;
    private LocalDate dataContratacao;
    private LocalDate dataTermino;
    private BigDecimal valor;
    private String descricao;
    private boolean ativo;
    private Carro carro;

    public Seguro(int id, LocalDate dataContratacao, LocalDate dataTermino, BigDecimal valor,
                  String descricao, boolean ativo, Carro carro) {
        this.id = id;
        this.dataContratacao = dataContratacao;
        this.dataTermino = dataTermino;
        this.valor = valor;
        this.descricao = descricao;
        this.ativo = ativo;
        this.carro = carro;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seguro seguro = (Seguro) o;
        return id == seguro.id && ativo == seguro.ativo && Objects.equals(dataContratacao, seguro.dataContratacao)
                && Objects.equals(dataTermino, seguro.dataTermino) && Objects.equals(valor, seguro.valor)
                && Objects.equals(descricao, seguro.descricao) && Objects.equals(carro, seguro.carro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataContratacao, dataTermino, valor, descricao, ativo, carro);
    }
}
