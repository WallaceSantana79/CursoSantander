package SetimaAula.Animais;

import java.util.Random;

public class Gato extends Animal {
    static int numeroDeGatos;
    private static final String[] SONS_DO_MIADO = {"Miau!", "Miau Miau", "Meow", "Purr", "Ronron", "Miaaaau"};
    
    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
        numeroDeGatos++;
    }
    @Override
    public void soar(){
        // Usando Random para escolher aleatoriamente um som do array
        Random random = new Random();
        int indiceSom = random.nextInt(SONS_DO_MIADO.length);
        String somEscolhido = SONS_DO_MIADO[indiceSom];

        System.out.println(somEscolhido);
    }
    @Override
    public String toString() {
        return "Gato []";
    }  
}
