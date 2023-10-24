package Main;

import Metodos.CarroPolicial;
import Metodos.CarroRoubado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reporter disse: ''Um ladrao fez um assalto a banco e fugiu com um milhao de reais!" +
                "\nAgora, cabe a policia fazer o trabalho, estamos aqui observando" +
                "\nas imagens acima do helicoptero!\n\n''");
        CarroPolicial carroPolicial = new CarroPolicial();
        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.addICarroPolicial(carroPolicial);

        carroRoubado.turnLeft();
        carroRoubado.turnRight();
    }
}