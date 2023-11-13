package QuartaAula;

public class Cachorro {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoEspirito;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoEspirito = estadoEspirito;
    }
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    public String getEstadoEspirito() {
        return estadoEspirito;
    }
}
