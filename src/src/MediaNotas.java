/* ALGUMAS DAS ATIVIDADES PROPOSTAS PELO CURSO

DESAFIO
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 10 e pedir para que o usuário tente adivinhar o número, em até 3 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

*/

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner insiraNotas = new Scanner(System.in);

        System.out.println("Insina a primeira nota: ");
        double nota1 = 0;
        while (!insiraNotas.hasNextDouble()){
            System.out.println("Valor inválido, digite um número válido: ");
            insiraNotas.next();                   //comando para limpar o buffer
            
        }
        nota1 = insiraNotas.nextDouble();

        System.out.println("Insina a segunda nota: ");
        double nota2 = 0;
        while (!insiraNotas.hasNextDouble()){
            System.out.println("Valor inválido, digite um número válido: ");
            insiraNotas.next();                   //comando para limpar o buffer

        }

        nota2 = insiraNotas.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
    }

}
