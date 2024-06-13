import OperacoesBasicas.AgendaContatos;

public class Teste {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Camila", 123456);
        agendaContatos.adicionarContatos("Camila", 5665);
        agendaContatos.adicionarContatos("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContatos("Camila DIO", 654987);
        agendaContatos.adicionarContatos("Maria Silva", 1111111);
        agendaContatos.adicionarContatos("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
