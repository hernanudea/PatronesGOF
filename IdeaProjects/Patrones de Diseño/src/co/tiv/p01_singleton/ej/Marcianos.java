package co.tiv.p01_singleton.ej;

/**
 * Created by herna on 17/07/2017.
 */
public final class Marcianos {
    private static final Marcianos marcianos = new Marcianos();
    private static int cantidad;

    private Marcianos() {
        cantidad = 10;
    }

    public static Marcianos getMarcianos() {
        return marcianos;
    }

    public static void derribaMarcianos() {
        if (cantidad > 0) {
            cantidad--;
            System.out.println("Soy bueno,  derribé un marciano!");
        }
    }

    public static void crearMarcianos() {
        if (cantidad > 0) {
            cantidad++;
            System.out.println("Soy malo, cree un nuevo marciano!");
        }
    }

    public static void cuantosQuedan() {
        if (cantidad > 0) {
            System.out.println("Quedan en el juego: " + cantidad + " marcianos!");
        } else {
            System.out.println("Feliciades, has ganado!");
        }
    }
}
