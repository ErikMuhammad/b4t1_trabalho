package app;

public class TipoDespesa {
    String nome;

    TipoDespesa(String nomeTipo) {
        nome = nomeTipo;
    }

    void exibir() {
        System.out.println("Tipo de Despesa: " + nome);
    }
}
