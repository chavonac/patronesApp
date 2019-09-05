package mx.com.msc.prototype;

public class LCD extends TV {
    private double costoFabricacion;

    public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion) {
        super(marca, pulgadas, color, precio);
        setCostoFabricacion(costoFabricacion);
    }

    public double getCostoFabricacion() {
        return this.costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

}