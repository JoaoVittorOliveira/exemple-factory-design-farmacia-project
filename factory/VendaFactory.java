package factory;

import interfaces.Venda;

public abstract class VendaFactory {
    public abstract Venda criarVenda(double valorTotal);
}
