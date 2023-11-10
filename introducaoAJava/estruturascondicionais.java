package introducaoAJava;
import java.util.Scanner;

public class estruturascondicionais {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a sua nota: "); 
            float nota = sc.nextFloat();
            String graduacao; 
            
            if (nota >= 8.0 && nota <= 10) {
                    graduacao = "A";
            }
            else if (nota >= 7.0 && nota < 8.0) {
                    graduacao = "B";
            }
            else if (nota >= 6.0 && nota < 7.0) {
                    graduacao = "C";
            }
            else if (nota < 0 || nota > 10) {
                    graduacao = "";
            }
            else {
                graduacao = "D";
            }
            
            switch (graduacao) {
                case "A":
                case "B":
                System.out.println("Aluno aprovado em graduação " + graduacao);
                break;
                case "C":
                case "D":
                System.out.println("Aluno reprovado em graduação " + graduacao);
                break;
                default:
                System.out.println("Não existe graduação pois a nota digitada é inválida.");
            }
        }    
    }
}
