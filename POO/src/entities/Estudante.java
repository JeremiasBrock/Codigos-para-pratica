package entities;

public class Estudante {
    public String nome;
    public double primeiroTrismestre;
    public double segundoTrismestre;
    public double terceiroTrismestre;

    public double notaFinal() {
        return primeiroTrismestre + segundoTrismestre + terceiroTrismestre;
    }

    public double aprovacao() {
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        } else {
            return 0.0;
        }
    }
}