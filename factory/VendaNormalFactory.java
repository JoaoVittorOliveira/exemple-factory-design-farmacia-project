package factory;

import interfaces.Venda;
import model.VendaNormal;

public class VendaNormalFactory extends VendaFactory {

    @Override
    public Venda criarVenda(double valorTotal){
        return new VendaNormal(valorTotal);
    }
}
