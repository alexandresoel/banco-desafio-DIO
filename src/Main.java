import com.alexandresoel.modelo.ContaCorrente;
import com.alexandresoel.modelo.Poupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        Poupanca p2 = new Poupanca();
        c1.conferirExtrato();
        c1.depositar(200.3);
        c1.conferirExtrato();
        c1.transferir(100.0,p2);
        p2.conferirExtrato();
    }
    }
