package SetimaAula.Animais;

public abstract class Animal {
    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    static int numeroDeAnimais;
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;

    public void comer(){

    }
    public void dormir(){

    }
    public abstract void soar();
    public static int getNumeroDeAnimais() {
        return numeroDeAnimais;
    }
    public static void setNumeroDeAnimais(int numeroDeAnimais) {
        Animal.numeroDeAnimais = numeroDeAnimais;
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
    public String getEstadoEspirito() {
        return estadoEspirito;
    }
    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }
}
