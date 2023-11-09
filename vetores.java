import java.util.Arrays;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o tamanho da lista: "); 
            int numero = sc.nextInt(); 
            int[] numeros = new int[numero];
            for(int i = 0; i < numeros.length; i++){
                numeros[i] = i;
                System.out.println(Arrays.toString(numeros));
            }
            int maior = numeros[0];
            int menor = numeros[0];
            int media = 0;

            for (int i=0; i < numeros.length; i++) {
                media += numeros[i];
                if (numeros[i] > maior){
                    maior = numeros[i];
                }
                else if (numeros[i] < menor) {
                    menor = numeros[i];
                }   
            }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media/numeros.length);
        }       
    }    
}
