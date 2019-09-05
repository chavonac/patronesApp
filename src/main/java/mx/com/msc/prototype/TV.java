package mx.com.msc.prototype;

public abstract class TV implements Cloneable {

    private String marcas;
    private int pulgadas;
    private String color;
    private double precio;

    public TV(String marca, int pulgadas, String color, double precio) {
        setMarcas(marca);
        setPulgadas(pulgadas);
        setPrecio(precio);
        setColor(color);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public String getMarcas() {
        return this.marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public int getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TV marcas(String marcas) {
        this.marcas = marcas;
        return this;
    }

    public TV pulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
        return this;
    }

    public TV color(String color) {
        this.color = color;
        return this;
    }

    public TV precio(double precio) {
        this.precio = precio;
        return this;
    }

}
