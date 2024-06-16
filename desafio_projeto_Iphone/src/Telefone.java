public class Telefone implements AparelhoTelefonico {
    public Telefone() {
    };

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

}
