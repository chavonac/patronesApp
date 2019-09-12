package mx.com.msc.mains;

import mx.com.msc.memento.*;

public class MementoMain {
    public static void main(String[] args) {
        Epoca epoca = new Epoca();
        Caretaker vigilante = new Caretaker();

        epoca.establecerTiempo("1000 A.C.");
        vigilante.setMemento(epoca.guardarMemento());
        epoca.establecerTiempo("500 D.C.");
        epoca.establecerTiempo("1000 D.C.");
        epoca.establecerTiempo("2000 D.C.");
        epoca.restablecerMemento(vigilante.getMemento());
    }   
}