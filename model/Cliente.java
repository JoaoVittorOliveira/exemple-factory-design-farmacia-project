package model;

public class Cliente {

    private String nome;
    private String cpf;
    private int pontosFidelidade;
    
    public Cliente(String nome, String cpf, int pontosFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontosFidelidade = pontosFidelidade;
    }

    public boolean podeUsarDescontoFidelidade()
    {
        return pontosFidelidade >= 10;
    }

    public void usarPontosFidelidade()
    {
        if(podeUsarDescontoFidelidade()) 
            pontosFidelidade -= 10;
    }
    
    public void adicionarPontos(int pontos)
    {
        pontosFidelidade += pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public void usarPontosParaDesconto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'usarPontosParaDesconto'");
    }
    
}