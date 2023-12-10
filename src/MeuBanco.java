import java.util.Scanner;

public class MeuBanco {
    public static void main(String[] args) {
        String nome = "João Marcos";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
        ** Digite sua opção: **
        1 - Consultar Saldo
        2 - Transferir
        3 - Receber
        4 - sair
        """;

        while (opcao != 4) {
            System.out.println();
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1 )
                System.out.println("\nSeu saldo é: " + saldo);

            else if (opcao == 2) {
                System.out.println("\nVocê solicitou uma transferenia.\nInforme o valor da transferencia:");
                double valor = leitor.nextDouble();
                if (valor > saldo)
                    System.out.println("\nSaldo insuficiente para realizar transferencia");
                else {
                    saldo -= valor;
                    System.out.println("\nTransferencia realizada com sucesso. \nAgora seu saldo é: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("\nVocê solicitou uma cobrança.\nInforme o valor da cobrança: ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("\nCobrança realizada com sucesso.\nAgora seu saldo é: " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida");

            } else {
                System.out.println("\nObrigado por vir ao MeuBanco.\nVolte Sempre, tchau :)");
            }
        }
    }
}