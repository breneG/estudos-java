import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas;

    public Banco(String nome) {
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarContas(Conta conta) {
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirContas() {
        System.out.println("=== " + this.getNome() + " ===");
        for (Conta conta : contas) {
            conta.imprimirConta();
        }
    }

}
