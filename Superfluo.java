package app;
import java.time.LocalDate;

public class Superfluo extends Despesa implements Pagavel {
    String tipo;

    Superfluo(String desc, double val, LocalDate venc, String tipoItem) {
        super(desc, val, venc, "Supérfluo");
        tipo = tipoItem;
    }

    public void registrarPagamento(double valorPago, String data) {
        paga = true;
        System.out.println("Pagamento de R$" + valorPago + " registrado em " + data + " para Despesa Supérflua.");
    }
}
