package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Agencia {
    String numeroAgencia;
    public Agencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    List<Conta> contasAgencia = new ArrayList<Conta>();
     protected  double saldoTotalAgencia(){
         Iterator<Conta> contas = contasAgencia.iterator();
         double saldoTotal = 0d;

         while (contas.hasNext()){
             saldoTotal += contas.next().saldo;
         }

         return saldoTotal;
     }
}
