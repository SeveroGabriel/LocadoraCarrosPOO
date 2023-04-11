package Basicas;

import java.time.LocalDateTime;

public class Pagamento {
    private LocalDateTime dataHoraPagamento;
    private double valorPago;
    private String formaPagamento;

    public Pagamento(LocalDateTime dataHoraPagamento, double valorPago, String formaPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
    }

    public LocalDateTime getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "dataHoraPagamento=" + dataHoraPagamento +
                ", valorPago=" + valorPago +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
