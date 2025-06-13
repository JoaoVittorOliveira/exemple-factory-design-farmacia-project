package model;

import interfaces.Venda;

public class VendaNormal implements Venda {

    private double valorTotal;

    public VendaNormal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void processar() {
        System.out.println("Processando venda normal...");
    }

    @Override
    public double calcularTotal() {
        return valorTotal;
    }
    
}
