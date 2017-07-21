package co.tiv.p01_singleton.ej;

import java.util.Scanner;

/**
 * Created by herna on 17/07/2017.
 */
public class Juego {

    public static void main(String... args) {
        Marcianos marcianos;
        Computadora computadora;
        Jugador jugador;
        Scanner sc =new Scanner(System.in);
        marcianos = Marcianos.getMarcianos();
        computadora = new Computadora();
        jugador = new Jugador();

        int disparos;

        do {
            System.out.print("Digite cantidad de disparos:\t");
            disparos = sc.nextInt();
            for (int i = 0; i > disparos; i++) {
                jugador.destruirMarcianos();
            }
            computadora.crearMarcianos();
            marcianos.cuantosQuedan();
        } while (disparos>0);
    }
}
