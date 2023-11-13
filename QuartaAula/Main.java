package QuartaAula;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(null, null, 0, 0, 0, null);

        cachorro1.setNome("Puppy");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

        cachorro1.comer();
        cachorro1.latir();

        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
    }
}
