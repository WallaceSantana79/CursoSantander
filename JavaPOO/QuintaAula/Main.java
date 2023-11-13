package QuintaAula;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10, 5, null);
        Cachorro cachorro2 = new Cachorro("Puppy", null, 0, 0, 0, null);

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        
    }
}
