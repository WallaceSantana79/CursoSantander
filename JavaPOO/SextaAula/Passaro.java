package SextaAula;

public class Passaro extends Animal{
    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
        numeroDePassaros++;
    }

    @Override
    public String toString() {
        return "Passaro []";
    }
    @Override
    public void soar() {
        System.out.println("PIU PIU!");
    }
}
