package Basicas;

import java.time.LocalDate;
import java.util.Objects;

public class Locacao {
    private int id;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private Veiculo veiculo;

    public Locacao(int id, LocalDate dataRetirada, LocalDate dataDevolucao, Cliente cliente, Veiculo veiculo) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Locacao)) return false;
        Locacao locacao = (Locacao) o;
        return id == locacao.id && Objects.equals(dataRetirada, locacao.dataRetirada) && Objects.equals(dataDevolucao, locacao.dataDevolucao) && Objects.equals(cliente, locacao.cliente) && Objects.equals(veiculo, locacao.veiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataRetirada, dataDevolucao, cliente, veiculo);
    }
}
