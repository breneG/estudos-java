package Pesquisa;

public class Livro {
    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nTítulo: " + this.titulo + " - " +
                "Autor: " + this.autor + " - " +
                "Ano de Publicação: " + this.anoPublicacao;
    }
}
