import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        int numero = 1010;
        String agencia = "0001";
        float saldo;
        String nomeCliente;
        Scanner inputCliente = new Scanner(System.in);

        System.out.printf("Digite seu nome \n");
        nomeCliente = inputCliente.nextLine();

        System.out.printf("Qual o valor do depósito inicial? \n");
        saldo = inputCliente.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque \n", nomeCliente, agencia, numero, saldo);
    }
}
