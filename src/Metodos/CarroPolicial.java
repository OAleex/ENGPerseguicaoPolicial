package Metodos;

import Interface.ICarroPolicial;

public class CarroPolicial implements ICarroPolicial {
    @Override
    public void follow(String direction) {
        System.out.println("Viatura virou na direcao: " + direction + "!");
    }
}
