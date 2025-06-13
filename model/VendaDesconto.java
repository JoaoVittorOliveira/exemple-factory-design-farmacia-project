package model;

import interfaces.Venda;

public class VendaDesconto implements Venda {

    private double valorTotal;
    
    public VendaDesconto(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void processar() {
        System.out.println("Processando venda com desconto de fidelidade...");
    }

    @Override
    public double calcularTotal() {
        return valorTotal * 0.9; // 10% de desconto
    }
    
}
