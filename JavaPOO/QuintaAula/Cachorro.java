package QuintaAula;

public class Cachorro {

    @Override
    public String toString() {
        return "O nome do cachorro é: " + nome + "\nA cor dele é: " + cor + "\nSua altura é altura: " + altura + "\nSeu peso: " + peso + "\nO tamanho do Rabo é: "
                + tamanhoDoRabo + "\nSeu estado do espírito é: " + estadoEspirito + "\nO número de cachorros é: " + numeroDeCachorros + "\n";
    }
    static int numeroDeCachorros;
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
        numeroDeCachorros ++;
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
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }
    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }
}
