//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio8 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        
        System.out.println("Valor recebido por hora: "); // Imprime na tela a mensagem
        double valor = enterScanner.nextInt(); //Aloca a variável valor e grava o valor digitado

        System.out.println("Tempo trabalhado no mês: "); // Imprime na tela a mensagem
        double tempo = enterScanner.nextInt(); //Aloca a variável tempo e grava o valor digitado
                
        double salario = valor * tempo; //Aloca a variável salário e grava 
        System.out.println("Seu ganho mensal é de: R$" + salario); // Imprime na tela a mensagem + salário
        enterScanner.close(); //Encerra as entradas do teclado
    }
}