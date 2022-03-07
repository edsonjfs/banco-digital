package banco;

public class Main {
    public static void main(String[] args) {
        Cliente Joao = new Cliente();
        Conta corrente = new ContaCorrente(Joao);
        ContaPoupanca poupanca = new ContaPoupanca(Joao, 0.003);

        corrente.depositar(500);
        corrente.transferir(200, poupanca);

        double rendimentos = poupanca.simularRendimento(10);

        System.out.println(corrente.saldo);
        System.out.println(poupanca.saldo);
        System.out.printf("%.2f", rendimentos);
    }
}
