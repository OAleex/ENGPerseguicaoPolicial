package Metodos;

import Interface.ICarroPolicial;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {

    private List<ICarroPolicial> observers = new ArrayList<>();

    public void addICarroPolicial(ICarroPolicial observer) {
        observers.add(observer);
    }

    public void turnLeft() {
        System.out.println("Carro roubado virou a esquerda...");
        notifyObservers("esquerda");
    }

    public void turnRight() {
        System.out.println("Carro roubado virou a direita...");
        notifyObservers("direita");
    }

    private void notifyObservers(String direction) {
        for (ICarroPolicial observer : observers) {
            observer.follow(direction);
        }
    }
}