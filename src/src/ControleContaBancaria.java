/* DESAFIO FINAL DO CURSO
*/

import java.util.Scanner;

public class ControleContaBancaria{
    public static void main(String[] args) {
        String nome = "Gerson Pompeu";
        String tipoConta = "Corrente";
        double saldo = 10000.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;

        Scanner opcaoDigitada = new Scanner(System.in);

        while (opcao !=4){
            System.out.println(menu);
            opcao = opcaoDigitada.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atualizado é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = opcaoDigitada.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = opcaoDigitada.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
