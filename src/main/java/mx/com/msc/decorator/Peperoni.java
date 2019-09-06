package mx.com.msc.decorator;

public class Peperoni extends DecoradorCubierta {
    Pizza pizza;

    public Peperoni(Pizza pizza) {
        super(pizza.getDescripcion());
        this.pizza = pizza;
    }

    public String getDescripcion() {
        return pizza.getDescripcion().concat(", peperoni extra");
    }

    public int getPrecio() {
        return pizza.getPrecio() + 20;
    }
}