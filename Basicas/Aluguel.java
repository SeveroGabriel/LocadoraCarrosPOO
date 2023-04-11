package Basicas;

import java.util.Objects;

public class Aluguel {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataFim;

    public Aluguel(int id, Cliente cliente, Veiculo veiculo, String dataInicio, String dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluguel aluguel = (Aluguel) o;
        return id == aluguel.id &&
                Objects.equals(cliente, aluguel.cliente) &&
                Objects.equals(veiculo, aluguel.veiculo) &&
                Objects.equals(dataInicio, aluguel.dataInicio) &&
                Objects.equals(dataFim, aluguel.dataFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, veiculo, dataInicio, dataFim);
    }
}
