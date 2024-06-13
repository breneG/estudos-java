import OperacoesBasicas.ConjuntoConvidado;
import PesquisaSet.AgendaContatos;

public class TesteSet {
    public static void main(String[] args) {
        // ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();
        // System.out.println(
        // "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do
        // Set de convidados.");

        // conjuntoConvidados.adicionarConvidados("Convidado 1", 1234);
        // conjuntoConvidados.adicionarConvidados("Convidado 2", 1235);
        // conjuntoConvidados.adicionarConvidados("Convidado 3", 1235);
        // conjuntoConvidados.adicionarConvidados("Convidado 4", 1236);

        // conjuntoConvidados.exibirConvidados();

        // System.out.println(
        // "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do
        // Set de convidados.");

        // conjuntoConvidados.exibirConvidados();

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555));

        agendaContatos.exibirContatos();
    }

}
