import java.util.Scanner;

public class ContaTerminal {
public static class Banco {
    String nomeBanco = "caiva egonomica sideral";
    String agencia;
    String nomeCliente;
    int numero;
    double saldo;
    

    public double depositar (double deposito){
        
        return saldo += deposito;
    }
    public double sacar(double saque){
        
        return saldo -= saque;//saque
    }


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
            novoBanco.numero = entrada.nextInt();
            if (novoBanco.numero==1021) {
                System.out.println("O numero da sua conta:"+ novoBanco.numero);
                novoBanco.nomeCliente = "MARIO ANDRADE ";
            }
        }
        System.out.println("_______________*******________________");
        System.out.println("-NOME CLIENTE: " + novoBanco.nomeCliente);
        System.out.println("-NUMERO DA AGÊNCIA: "+novoBanco.agencia);
        System.out.println("-NUMERO DA CONTA: "+novoBanco.numero);

        System.out.println("_______________*******________________");
        int operacao;

        System.out.println("Operações");
        System.out.println("1-Saldo");
        System.out.println("2-Sacar");
        System.out.println("3-Depositar");
operacao= entrada.nextInt();
        switch (operacao) {
            case 1:
            novoBanco.sacar(entrada.nextDouble());
            System.out.println(novoBanco.saldo);

                
                break;
                 case 2:
                 novoBanco.depositar(entrada.nextDouble());
                
                 System.out.println(novoBanco.saldo);



                
                    break;
                       case 3:
System.out.println(novoBanco.saldo);                        break;
        
            default:
                break;
        }



        entrada.close();
    }
}
