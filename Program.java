import java.util.Scanner;

import model.Cliente;
import service.VendaService;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Sistema de Vendas da Farmácia ===");

        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.print("Informe a quantidade de pontos de fidelidade do cliente (0 a 100): ");
        int pontosFidelidade = Integer.parseInt(scanner.nextLine());

        Cliente cliente = new Cliente(nome, cpf, pontosFidelidade);

        boolean usarDesconto = false;

        if (cliente.podeUsarDescontoFidelidade()) {
            System.out.print("Deseja utilizar 10 pontos para obter 10% de desconto? (s/n): ");
            String resposta = scanner.nextLine();
            usarDesconto = resposta.equalsIgnoreCase("s");
        }

        System.out.print("Informe o valor total da venda (R$): ");
        double valorTotal = Double.parseDouble(scanner.nextLine());

        VendaService vendaService = new VendaService();
        vendaService.realizarVenda(cliente, valorTotal, usarDesconto);

        scanner.close();
    }
}
