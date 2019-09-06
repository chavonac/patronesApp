package mx.com.msc.decorator;

public class CarnesFrias extends Pizza {

    public CarnesFrias() {
        super("pizza de carnes frias");
    }

    public int getPrecio() {
        return 200;
    }
}