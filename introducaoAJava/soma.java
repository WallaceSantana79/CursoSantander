package introducaoAJava;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: "); 
            float a = sc.nextFloat(); 
            System.out.print("Digite o segundo número: ");
            float b = sc.nextFloat();
            float soma = a + b;
            float subtracao = a - b;
            float multiplicacao = a * b;
            float divisao = a / b;
            System.out.println("A soma dos valores é: " + soma + "\nA subtração dos valores é: " + subtracao + "\nA multiplicação dos valores é: " + multiplicacao + "\nA divisão dos valores é: " + divisao);
        }
    }
}
