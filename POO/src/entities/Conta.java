package entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double valor;

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }
    
    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public double getValor() {
        return valor;
    }

    public void deposito(double valor) {
        this.valor += valor;
    }

    public void sacar (double valor) {
        this.valor -= valor + 5;
    }

    public String toString() {
        return "Conta: "
                + numeroConta
                + ", "
                + "nome do titular: " + nomeTitular
                + ", "
                + "saldo de: R$"
                + valor;
    }
}
