package Basicas;

import java.util.Objects;

public class Carro extends Veiculo {
    private int numPortas;
    private String cor;
    private int capacidade;

    public Carro(int id, String modelo, String fabricante, int ano, int numPortas, int capacidade, String cor) {
        super(id, modelo, fabricante, ano, cor);
        this.numPortas = numPortas;
        this.capacidade = capacidade;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
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
        if (!(o instanceof Carro)) return false;
        if (!super.equals(o)) return false;
        Carro carro = (Carro) o;
        return numPortas == carro.numPortas && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPortas, cor);
    }

	public int getCapacidade() {
		return capacidade;
	}
}
