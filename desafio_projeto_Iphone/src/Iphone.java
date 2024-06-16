public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new Musicas();
        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        NavegadorInternet navegadorInternet = new Navegador();

        reprodutorMusical.selecionarMusica("Blue Bird");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        System.out.println("=================================================================");

        aparelhoTelefonico.ligar("(00) 90000-0000");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("=================================================================");

        navegadorInternet.exibirPagina("www.desafiocodigo.dio.br");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }
}
