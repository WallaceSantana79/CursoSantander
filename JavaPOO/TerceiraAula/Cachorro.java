package TerceiraAula;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoEspirito;

    public void comer(){
        System.out.println("Cachorro está comendo!");
    }
    public void latir(){
        System.out.println("AU AU!");
    }
    public String pegar(){
        return "Bolinha";
    }
    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoEspirito = "feliz";
        }else if(acao.equals("Vai dormir!".toUpperCase())){
            this.estadoEspirito = "Bravo";
        }else{
            this.estadoEspirito = "Neutro";
        }
        return estadoEspirito;
    }

}
