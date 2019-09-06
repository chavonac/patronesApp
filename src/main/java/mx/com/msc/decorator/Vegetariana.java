package mx.com.msc.decorator;

public class Vegetariana extends Pizza {

    public Vegetariana() {
        super("pizza vegetariana");
    }

    public int getPrecio() {
        return 130;
    }
}