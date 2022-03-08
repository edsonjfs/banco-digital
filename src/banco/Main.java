package banco;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Agencia agencia001 = new Agencia("001");

        Cliente Joao = new Cliente("Joao");
        Conta corrente = new ContaCorrente(Joao);
        ContaPoupanca poupanca = new ContaPoupanca(Joao, 0.003);

        agencia001.contasAgencia.add(corrente);
        agencia001.contasAgencia.add(poupanca);

        corrente.depositar(500);
        corrente.transferir(200, poupanca);

        double rendimentos = poupanca.simularRendimento(10);

        System.out.println(corrente.saldo);
        System.out.println(poupanca.saldo);
        System.out.printf("%.2f", rendimentos);
        System.out.println();

        Collections.sort(agencia001.contasAgencia);

        for (Conta conta : agencia001.contasAgencia){
            System.out.println(conta);
        }

        System.out.println("O saldo total da Agencia é " + agencia001.saldoTotalAgencia());
    }
}
