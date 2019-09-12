package mx.com.msc.mains;
import mx.com.msc.mediator.*;

public class MediatorMain {
    public static void main(String[] args) {
        Mediador m = new Mediador();

        Colega c1 = new ColegaConcreto1(m);
        Colega c2 = new ColegaConcreto2(m);
        Colega c3 = new ColegaConcreto3(m);

        m.agregarColega(c1);
        m.agregarColega(c2);
        m.agregarColega(c3);

        c2.comunicar("ColegaConcreto2 ha cambiado");

    }
}