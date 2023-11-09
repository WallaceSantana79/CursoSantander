import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class mStringsData {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um nome: "); 
            String nome = sc.nextLine();
            
            //ISO 8601
            LocalDate hoje = LocalDate.now();
            Locale brasil = new Locale("pt", "BR");
            //Locale brasil = new Locale("pt", "BR");
            String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
            String saudacao;
            LocalDateTime agora = LocalDateTime.now();
            if (agora.getHour() >= 0 && agora.getHour() < 12) {
                saudacao = "bom dia";
            }
            else if (agora.getHour() >= 12 && agora.getHour() < 18) {
                saudacao = "boa tarde";
            }
            else if (agora.getHour() >= 18 || agora.getHour() < 24){
                saudacao = "boa noite";
            }           
            else {
                saudacao = "Olá.";
            }
            System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome,diaSemana,saudacao.toUpperCase());
        }
    }
}
