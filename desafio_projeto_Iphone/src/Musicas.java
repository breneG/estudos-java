public class Musicas implements ReprodutorMusical {
    private String musica = "";

    public Musicas() {
    };

    @Override
    public void tocar() {
        System.out.println("A música " + musica + " está sendo reproduzida!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada.");
        this.musica = musica;
    }

}
