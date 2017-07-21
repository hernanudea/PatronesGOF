package co.tiv.p01_singleton.ej;

/**
 * Created by herna on 17/07/2017.
 */
public class Jugador {
    private Marcianos marcianos;

    public Jugador() {
        marcianos = Marcianos.getMarcianos();
    }

    public void destruirMarcianos() {
        marcianos.derribaMarcianos();
    }
}
