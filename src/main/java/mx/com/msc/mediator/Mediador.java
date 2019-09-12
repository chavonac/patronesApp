package mx.com.msc.mediator;

import java.util.ArrayList;

public class Mediador implements IMediador {
    private ArrayList<Colega> colegas;

    public Mediador() {
        this.colegas = new ArrayList<Colega>();
    }

    public void agregarColega(Colega c) {
        this.colegas.add(c);
    }

    @Override
    public void enviar(String mensaje, Colega originador) {
        for (Colega colega : colegas) {
            if (!colega.equals(originador)) {
                colega.recibir(mensaje);
            }
        }
    }
}