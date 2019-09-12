package mx.com.msc.memento;

public class Memento {
    private final String tiempo;

    public Memento(String tiempoGuardado) {
        tiempo = tiempoGuardado;
    }

    public String getTiempoGuardado() {
        return tiempo;
    }
}