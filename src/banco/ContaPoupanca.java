package banco;

public class ContaPoupanca extends Conta {
    double rendimentoMensal;

    public ContaPoupanca (Cliente cliente, double rendimentoMensal) {
        super(cliente);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double simularRendimento (int mesesRendimento) {
        return saldo * Math.pow(1 + rendimentoMensal, mesesRendimento);
    }
}
