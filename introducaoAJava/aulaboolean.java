package introducaoAJava;
public class aulaboolean {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol; // Utilizando || para se designar a "ou" o que foi usado foi o && que se designa a "e"
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    
    }   
}
