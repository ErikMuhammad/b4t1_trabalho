package app;
import java.time.LocalDate;

public class Transporte extends Despesa implements Pagavel {
    String meio;

    Transporte(String desc, double val, LocalDate venc, String meio) {
        super(desc, val, venc, "Transporte");
        this.meio = meio;
    }

    public void registrarPagamento(double valorPago, String data) {
        paga = true;
        System.out.println("Pagamento de R$" + valorPago + " registrado em " + data + " para Transporte.");
    }
}
