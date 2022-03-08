package banco;
public class Cliente {
    String nome;
    public Cliente(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}
