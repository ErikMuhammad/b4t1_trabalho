package app;
import java.time.LocalDate;

public class Eventual extends Despesa implements Pagavel {
    String motivo;

    Eventual(String desc, double val, LocalDate venc, String mot) {
        super(desc, val, venc, "Eventual");
        motivo = mot;
    }

    public void registrarPagamento(double valorPago, String data) {
        paga = true;
        System.out.println("Pagamento de R$" + valorPago + " registrado em " + data + " para Despesa Eventual.");
    }
}
