import OperacoesBasicas.AgendaContatos;
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

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adicionarProdutos(1L, "Produto A", 5.0, 10);
        estoque.adicionarProdutos(2L, "Produto B", 10.0, 5);
        estoque.adicionarProdutos(3L, "Produto C", 15.0, 2);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: \n" + estoque.obterProdutoMasiCaro());

    }
}
