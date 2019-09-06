package mx.com.msc.decorator;

abstract class DecoradorCubierta extends Pizza {

    public DecoradorCubierta(String descripcion) {
        super(descripcion);
    }

    public abstract String getDescripcion();
}