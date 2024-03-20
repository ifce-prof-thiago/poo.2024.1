
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var palpites = new ArrayList<Integer>();

        Scanner ler = new Scanner(System.in); // Cria um objeto Scanner

        int numero = (int) (Math.random() * 40 + 1); // Gera um número aleatório entre 1 e 100

        System.out.println("Digite os palpites: "); // Solicita um número ao usuário

        while (palpites.size() < 20) {
            var chute = ler.nextInt(); // Lê o número digitado pelo usuário
            palpites.add(chute);
        }

        for (var p : palpites) {
            if (p == numero) {
                System.out.println("Parabéns, você acertou!"); // Exibe uma mensagem de parabéns
                System.out.println("Número de tentativas: " + palpites.size()); // Exibe o número de tentativas
                System.out.println("Número sorteado: " + numero); // Exibe o número sorteado
                return;
            }
        }

        System.out.println("Você perdeu!"); // Exibe uma mensagem de parabéns
        System.out.println("Número sorteado: " + numero); // Exibe o número sorteado
    }

}
