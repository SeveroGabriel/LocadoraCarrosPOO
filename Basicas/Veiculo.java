package Basicas;

import java.util.Objects;

public class Veiculo {
    private int id;
    private String modelo;
    private String placa;
    private int ano;
    private String cor;

    public Veiculo(int id, String modelo, String placa, int ano, String cor) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return id == veiculo.id &&
                ano == veiculo.ano &&
                Objects.equals(modelo, veiculo.modelo) &&
                Objects.equals(placa, veiculo.placa) &&
                Objects.equals(cor, veiculo.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, placa, ano, cor);
    }
}
