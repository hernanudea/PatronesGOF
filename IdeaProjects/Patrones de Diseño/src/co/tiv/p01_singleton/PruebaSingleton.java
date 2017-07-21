package co.tiv.p01_singleton;

/**
 * Created by herna on 17/07/2017.
 */
public class PruebaSingleton {
    public static void main(String [] args){
        //no podemos usar eloperador new para crear unainstancia, ya que el constructor el privado
        Singleton singleton = Singleton.obtenerSingleton();

        Singleton singleton2 = Singleton.obtenerSingleton();
        Singleton singleton3 = Singleton.obtenerSingleton();
        Singleton singleton4 = Singleton.obtenerSingleton();
        Singleton singleton5 = Singleton.obtenerSingleton();
        Singleton singleton6 = Singleton.obtenerSingleton();
        Singleton singleton7 = Singleton.obtenerSingleton();

        singleton5.mostrarCantidad();
        System.out.println("He terminado de crear los Singleton");

    }
}
