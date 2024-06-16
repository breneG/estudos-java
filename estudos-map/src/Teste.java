import java.time.LocalDate;
import java.time.Month;

import OperacoesBasicas.AgendaContatos;
import OrdenacaoMap.AgendaEventos;
import PesquisaMap.EstoqueProdutos;

public class Teste {
    public static void main(String[] args) throws Exception {
        // AgendaContatos agendaContatos = new AgendaContatos();

        // agendaContatos.adicionarContatos("Camila", 123456);
        // agendaContatos.adicionarContatos("Camila", 5665);
        // agendaContatos.adicionarContatos("Camila Cavalcante", 1111111);
        // agendaContatos.adicionarContatos("Camila DIO", 654987);
        // agendaContatos.adicionarContatos("Maria Silva", 1111111);
        // agendaContatos.adicionarContatos("Camila", 44444);

        // agendaContatos.exibirContatos();

        // agendaContatos.removerContato("Maria Silva");
        // agendaContatos.exibirContatos();

        // System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila
        // DIO"));

        // EstoqueProdutos estoque = new EstoqueProdutos();
        // estoque.exibirProduto();

        // estoque.adicionarProdutos(1L, "Produto A", 5.0, 10);
        // estoque.adicionarProdutos(2L, "Produto B", 10.0, 5);
        // estoque.adicionarProdutos(3L, "Produto C", 15.0, 2);

        // estoque.exibirProduto();

        // System.out.println("Valor total do estoque: R$ " +
        // estoque.calculaValorTotalEstoque());
        // System.out.println("Produto mais caro: \n" + estoque.obterProdutoMasiCaro());

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEventos(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.JULY, 12), "Evento 4", "Atração 4");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
