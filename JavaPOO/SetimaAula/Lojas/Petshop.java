package SetimaAula.Lojas;

import SetimaAula.Animais.Cachorro;
import SetimaAula.Animais.Animal;

public class Petshop{
    public void darBanho(Animal animal) {
        animal.setEstadoEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoEspirito("tosado");
    }
    public void deixarNoHotel(Animal animal){
        animal.setEstadoEspirito("com saudades");
    }
}
