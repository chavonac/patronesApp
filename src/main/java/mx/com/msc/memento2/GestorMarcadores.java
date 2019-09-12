package mx.com.msc.memento2;

import java.util.ArrayList;

public class GestorMarcadores {
    private ArrayList<Memento> marcadores = new ArrayList<Memento>();

    public void addPosicionMarcador(Memento m) {
        marcadores.add(m);
    }

    public Memento getPosicionMarcador(int indice) {
        return marcadores.get(indice);
    }
}