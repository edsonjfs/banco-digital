package banco;

public class Conta {
   protected String numeroConta;
   protected String agencia;
   protected double saldo = 0;
   protected Cliente cliente;

    public Conta() {
    }

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
