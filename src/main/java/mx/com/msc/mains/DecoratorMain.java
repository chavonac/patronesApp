package mx.com.msc.mains;

import mx.com.msc.decorator.CarnesFrias;
import mx.com.msc.decorator.Peperoni;
import mx.com.msc.decorator.Pizza;
import mx.com.msc.decorator.Salchicha;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza p1 = new CarnesFrias();
        System.out.println(p1.getDescripcion().concat(" - Precio: ") + p1.getPrecio());

        p1 = new Peperoni(p1);
        p1 = new Salchicha(p1);
        System.out.println(p1.getDescripcion().concat(" - Precio: ") + p1.getPrecio());
    }
}