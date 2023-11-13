package SetimaAula;

import SetimaAula.Animais.Cachorro;
import SetimaAula.Animais.Gato;
import SetimaAula.Lojas.Petshop;
import SetimaAula.Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(0, "Rex", "Branco", 0);
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Bird", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoEspirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());
        petshop.deixarNoHotel(passaro1);
        System.out.println(passaro1.getEstadoEspirito());
    }
}
