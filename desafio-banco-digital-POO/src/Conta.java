public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 0;

    private static int SEQUENCIAL = 1;

    protected String tipoConta;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, String tipoConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public void imprimirConta() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("- " + getTipoConta());
    }

    protected void inprimirInfosComuns() {
        System.out.println(String.format("Titular: %S", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %2f\n", this.saldo));
    }
}
