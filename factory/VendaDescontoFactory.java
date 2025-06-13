package factory;

import interfaces.Venda;
import model.VendaDesconto;

public class VendaDescontoFactory extends VendaFactory {

    @Override
    public Venda criarVenda(double valorTotal){
        return new VendaDesconto(valorTotal);
    }
    
}
