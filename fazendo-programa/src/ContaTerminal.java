import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme seu nome:");
        String nome = ler.nextLine();
        System.out.println("Informe sua data de nascimento:");
        System.out.print("Dia - ");
        int dia = ler.nextInt();
        System.out.print("Mês - ");
        int mês = ler.nextInt();
        System.out.print("Ano - ");
        int ano = ler.nextInt();

        // Exibir pela scanner os valores digitados no terminal
        System.out.println("\nNome = " + nome);
        System.out.println("Nascimento = " + dia + "/" + mês + "/" + ano);

        // Exibir a mensagem conta criada
        System.out.println("\nConta criada com sucesso!\n");

        ler.close();
    }
}
