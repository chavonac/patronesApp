package mx.com.msc.mains;

import mx.com.msc.mediator2.*;

public class MediatorMain2 {
    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Vuelo v101 = new Vuelo(atcMediator);
        Pista pistaPrincipal = new Pista(atcMediator);

        atcMediator.registrarPista(pistaPrincipal);
        atcMediator.registrarVuelo(v101);
        v101.getReady();
        pistaPrincipal.aterrizar();
        v101.aterrizar();
    }
}