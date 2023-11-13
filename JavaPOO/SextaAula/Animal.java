package SextaAula;

public class Animal{
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
    public void soar(){
        System.out.println("cri cri");
    }
}

