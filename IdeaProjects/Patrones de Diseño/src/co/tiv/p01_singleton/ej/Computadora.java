package co.tiv.p01_singleton.ej;

/**
 * Created by herna on 17/07/2017.
 */
public class Computadora {
    private Marcianos marcianos = Marcianos.getMarcianos();
    public Computadora(){}

    public void crearMarcianos(){
        marcianos.crearMarcianos();
    }
}
