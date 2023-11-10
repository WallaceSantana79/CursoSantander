package introducaoAJava;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um nome: "); 
            String nome = sc.nextLine(); 
            System.out.println("Hello " + nome + "!");
        }
    }
}
