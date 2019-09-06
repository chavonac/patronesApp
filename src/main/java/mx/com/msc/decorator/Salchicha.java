package mx.com.msc.decorator;

public class Salchicha extends DecoradorCubierta {

    Pizza pizza;

    public Salchicha(Pizza pizza) {
        super(pizza.getDescripcion());
        this.pizza = pizza;
    }

    public String getDescripcion() {
        return pizza.getDescripcion().concat(", salchicha extra");
    }

    public int getPrecio() {
        return pizza.getPrecio() + 30;
    }
}