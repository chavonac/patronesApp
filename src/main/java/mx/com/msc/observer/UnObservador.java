package mx.com.msc.observer;

public class UnObservador implements IObservador {
    private String nombre;

    public UnObservador(String nombre) {
        this.nombre = nombre;
        System.out.println("Observador [" + this.nombre + "] creado");
    }

    @Override
    public void observadoActualizado() {
        System.out.println("Observador [" + this.nombre + "] recibe la notificación");
    }
}