public class Navegador implements NavegadorInternet {
    public Navegador() {
    };

    @Override
    public void exibirPagina(String url) {
        System.out.println("A página está sendo exibida pelo link: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("A nova página aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}
