# Sistema de Vendas da Farmácia

Este é um projeto Java que simula um sistema de vendas para uma farmácia, com aplicação de padrões de projeto (GoF) e gerenciamento de pontos de fidelidade para clientes. O projeto segue uma arquitetura organizada em camadas e utiliza o padrão Factory para o processamento das vendas.

## Funcionalidades

* Cadastro de cliente com CPF e pontos de fidelidade
* Processamento de vendas com ou sem desconto
* Aplicacão de desconto de 10% utilizando pontos de fidelidade
* Registro de vendas em um arquivo de log
* Acúmulo de pontos com base no valor da venda

## Padrões de Projeto Utilizados

* **Factory Method**: Para criar instâncias de vendas com ou sem desconto.

## Estrutura de Diretórios de Arquivos

```
.
├── factory
│   ├── VendaFactory.java
│   ├── VendaDescontoFactory.java
│   └── VendaNormalFactory.java
├── interfaces
│   └── Venda.java
├── model
│   ├── Cliente.java
│   ├── VendaDesconto.java
│   └── VendaNormal.java
├── service
│   └── VendaService.java
├── Program.java
├── log_vendas.txt
└── README.md
```

## Como Executar

1. Certifique-se de ter o Java instalado (Java 8+).
2. Compile os arquivos:

```bash
javac Program.java
```

3. Execute o programa:

```bash
java Program
```

## Exemplo de Execução

```
=== Sistema de Vendas da Farmácia ===
Informe o nome do cliente: Ana
Informe o CPF do cliente: 12345678900
Informe a quantidade de pontos de fidelidade do cliente (0 a 100): 20
Deseja utilizar 10 pontos para obter 10% de desconto? (s/n): s
Informe o valor total da venda (R$): 100
Cliente: Ana
Valor final da venda: R$ 90.00
Pontos ganhos nesta venda: 9
Pontos acumulados: 19
```

## Autores

Diego Licón, Gisele Oliveira e João Víttor Costa

---

Este projeto é parte de um estudo sobre a aplicação de padrões de projeto (GoF) na prática. 
