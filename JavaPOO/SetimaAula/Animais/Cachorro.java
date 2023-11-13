package SetimaAula.Animais;

public class Cachorro extends Animal {
    @Override
    public String toString() {
        return "Cachorro []";
    }
    @Override
    public void soar(){
        System.out.println("AU AU!");
    }
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    public Cachorro(int tamanhoDoRabo, String nome, String cor, double peso) {
        super(nome, cor, peso);
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros ++;
    }
    public String pegar(){
        return "Bolinha";
    }
    public String interagir(String acao) {
        switch (acao) {
            case "carinho": this.estadoEspirito = "feliz";
                break;
            case "vai dormir!": this.estadoEspirito = "bravo";
                break;
            case "pisar na patinha": this.estadoEspirito = "triste";
                break;
            default:
                this.estadoEspirito = "Neutro";
                break;
        }
        return this.estadoEspirito;
    }
    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }
}
