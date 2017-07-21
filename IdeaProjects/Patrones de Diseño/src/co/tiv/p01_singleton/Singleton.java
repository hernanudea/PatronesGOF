package co.tiv.p01_singleton;

/**
 * Created by herna on 17/07/2017.
 */
//clase con final
public final class Singleton {

    private static final Singleton singleton = new Singleton();
    private static int cantidad;

    //contructor privado
    private Singleton() {
        System.out.println("Hola, he sido creado una unica vez!!!");
    }

    //retorna el objeto singleton,metodo static
    public static Singleton obtenerSingleton() {
        cantidad++;
        return singleton;
    }

    //los metodos deben ser static
    //pueden ser llamados sin instanciar y solo existe una instancia del metodo osus atributos
    public static void mostrarCantidad() {
        System.out.println("La cantidad es: " + cantidad);
    }
}
