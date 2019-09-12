package mx.com.msc.mains;

import mx.com.msc.memento2.*;

public class MementoMain2 {
    public static void main(String[] args) {
        GestorMarcadores gestorMarcadores = new GestorMarcadores();

        Libro libro = new Libro();
        libro.irPagina(10);
        gestorMarcadores.addPosicionMarcador(libro.guardarMarcador());

        libro.irPagina(83);
        gestorMarcadores.addPosicionMarcador(libro.guardarMarcador());

        libro.recuperarPagina(gestorMarcadores.getPosicionMarcador(0));

    }
}