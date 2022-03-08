package banco;

public class ContaCorrente extends Conta {

    String tipo = "Corrente";
    public ContaCorrente (Cliente cliente) {
        super(cliente);
    }
    @Override
    public String toString() {
        return "Conta " + tipo + " do " + cliente + "Saldo: " + saldo;
    }
}
