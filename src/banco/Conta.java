package banco;

public class Conta implements Comparable<Conta> {
   protected String tipo;
   protected String numeroConta;
   protected String agencia;
   protected double saldo = 0;
   protected Cliente cliente;
    public Conta() {
    }
    @Override
    public int compareTo(Conta conta) {
        double diferenca = this.saldo - conta.saldo ;
        if (diferenca == 0) return 0 ;
        if (diferenca > 0) return -1;
        else return 1;
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
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
}
