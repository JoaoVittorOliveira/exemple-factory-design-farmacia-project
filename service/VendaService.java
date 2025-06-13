package service;

import factory.VendaFactory;
import factory.VendaNormalFactory;
import interfaces.Venda;
import model.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import factory.VendaDescontoFactory;

public class VendaService {

    private List<Venda> historicoVendas = new ArrayList<>();

    private static final String LOG_PATH = "log_vendas.txt";

    public void realizarVenda(Cliente cliente, double valorTotal, boolean usarDescontoFidelidade) {
        VendaFactory factory;

        if (usarDescontoFidelidade && cliente.podeUsarDescontoFidelidade()) {
            factory = new VendaDescontoFactory();
            cliente.usarPontosFidelidade();
        } else {
            factory = new VendaNormalFactory();
        }

        Venda venda = factory.criarVenda(valorTotal);
        venda.processar();

        double totalFinal = venda.calcularTotal();
        historicoVendas.add(venda);

        int pontosGanhos = (int) (totalFinal / 10);
        cliente.adicionarPontos(pontosGanhos);

        System.out.printf("Cliente: %s%n", cliente.getNome());
        System.out.printf("Valor final da venda: R$ %.2f%n", totalFinal);
        System.out.printf("Pontos ganhos nesta venda: %d%n", pontosGanhos);
        System.out.printf("Pontos acumulados: %d%n", cliente.getPontosFidelidade());

        registrarVendaEmLog(cliente.getNome(), totalFinal, pontosGanhos, cliente.getPontosFidelidade());
    }

    private void registrarVendaEmLog(String nomeCliente, double totalFinal, int pontosGanhos, int pontosTotais) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write("Cliente: " + nomeCliente + "\n");
            writer.write(String.format("Valor final da venda: R$ %.2f%n", totalFinal));
            writer.write("Pontos ganhos nesta venda: " + pontosGanhos + "\n");
            writer.write("Pontos acumulados: " + pontosTotais + "\n");
            writer.write("======\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }

    public List<Venda> getHistoricoVendas() {
        return historicoVendas;
    }
}