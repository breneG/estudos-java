import Odenacao.OrdenacacoPessoa;
import OperacoesBasicas.*;
import Pesquisa.*;

public class Teste {
    public static void main(String[] args) {
        OrdenacacoPessoa ordenacacoPessoa = new OrdenacacoPessoa();
        ordenacacoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacacoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacacoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacacoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Ordenação por Altura:\n" + ordenacacoPessoa.ordenarPorAltura());
        System.out.println();
        System.out.println("Ordenação por Idade:\n" + ordenacacoPessoa.ordenarPorIdade());

        // TESTE CATALOGO DE LIVROS - - - - - - - - - - - - - - - - - - - - - - - - - -
        // CatalogoLivros catalogoLivros = new CatalogoLivros();
        // catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2010);
        // catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        // catalogoLivros.adicionarLivros("Livro 3", "Autor 2", 2022);
        // catalogoLivros.adicionarLivros("Livro 4", "Autor 3", 2023);
        // catalogoLivros.adicionarLivros("Livro 5", "Autor 4", 1994);

        // System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        // System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
        // System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

        // TESTE LISTA DE TAREFAS - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // ListaTarefas listaTarefa = new ListaTarefas();

        // System.out.println("O número total de elementos na lista é: " +
        // listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.adicionarTarefas("Tarefa 1");
        // listaTarefa.adicionarTarefas("Tarefa 1");
        // listaTarefa.adicionarTarefas("Tarefa 2");
        // System.out.println("O número total de elementos na lista é: " +
        // listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.removerTarefa("Tarefa 1");
        // System.out.println("O número total de elementos na lista é: " +
        // listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.obterDescricoesTarefas();
    }
}
