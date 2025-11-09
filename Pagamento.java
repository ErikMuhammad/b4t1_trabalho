package app;
import java.time.LocalDate;

public class Pagamento {
    double valor;
    LocalDate data;

    Pagamento(double val, LocalDate dt) {
        valor = val;
        data = dt;
    }

    void exibirPagamento() {
        System.out.println("Pagamento de R$" + valor + " em " + data);
    }
}
