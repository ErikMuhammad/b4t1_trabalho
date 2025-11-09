package app;
import java.time.LocalDate;

public abstract class Despesa {
    int id;
    String descricao;
    double valor;
    LocalDate dataVencimento;
    String categoria;
    boolean paga;

    Despesa() {}

    Despesa(String desc, double val, LocalDate venc, String cat) {
        id = (int) (Math.random() * 10000);
        descricao = desc;
        valor = val;
        dataVencimento = venc;
        categoria = cat;
        paga = false;
    }

    void marcarComoPaga() {
        paga = true;
    }

    void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Vencimento: " + dataVencimento);
        System.out.println("Categoria: " + categoria);
        System.out.println("Status: " + (paga ? "Paga" : "Em aberto"));
    }
}
