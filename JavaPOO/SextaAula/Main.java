package SextaAula;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(0, "Rex", "Branco", 0);
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Flip", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
