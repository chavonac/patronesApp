package mx.com.msc.decorator;

public abstract class Pizza {
    private String descripcion = "";

    public Pizza(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract int getPrecio();
}