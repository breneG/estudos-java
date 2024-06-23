public class Main {
    public static void main(String[] args) throws Exception {
        Banco santander = new Banco("Santander");

        Cliente venilton = new Cliente("Venilton");
        Cliente erivelton = new Cliente("Erivelton");
        Cliente carlos = new Cliente("Carlos");
        Cliente aldair = new Cliente("Aldair");

        Conta c1 = new ContaCorrente(venilton);
        santander.adicionarContas(c1);
        Conta p1 = new ContaPoupanca(carlos);
        santander.adicionarContas(p1);
        Conta c2 = new ContaCorrente(erivelton);
        santander.adicionarContas(c2);
        Conta p2 = new ContaPoupanca(aldair);
        santander.adicionarContas(p2);

        c1.depositar(200);
        c2.depositar(350);
        p2.depositar(300);

        c1.transferir(50, p2);
        c2.transferir(100, p1);
        p1.transferir(10, p2);
        p2.transferir(200, p1);
        p1.transferir(100, c1);

        c1.imprimirExtrato();
        c2.imprimirExtrato();
        p1.imprimirExtrato();
        p2.imprimirExtrato();

        System.out.println("\n----------------------------------------------------------\n");

        santander.imprimirContas();
    }
}
