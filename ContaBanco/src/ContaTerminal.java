import java.util.Scanner;

public class ContaTerminal {
public static class Banco {
    String nomeBanco = "caiva ergonomica sideral";
    String agencia;
    String nomeCliente;
}

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Banco novoBanco = new Banco();
        //novoBanco.nomeBanco ="Italu Bank";
        System.out.println("Hello, World! Wellcome in your Bank " + novoBanco.nomeBanco);
        System.out.println("Por favor, digite o número da Agência !");
        novoBanco.agencia = entrada.nextLine();
        if (novoBanco.agencia.equals("0678")) {
            System.out.println("Sua agencia é "+novoBanco.agencia);
            System.out.println("Agora digite o numero da conta: ");
        }
        entrada.close();
    }
}
