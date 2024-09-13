/* ALGUMAS DAS ATIVIDADES PROPOSTAS PELO CURSO

DESAFIO
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.

Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.

Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.

*/

import java.util.Scanner;

import static java.lang.System.in;

public class ConversaoTemperaturas {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(in);

        System.out.println("Insira o valor da temperatura: ");
        double temperaturaEmCelsius = valorDigitado.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
