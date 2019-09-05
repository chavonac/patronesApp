package mx.com.msc.prototype;

public class Plasma extends TV {
    private double anguloVision;
    private double tiempoRespuesta;

    public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision,
            double tiempoRespuesta) {
        super(marca, pulgadas, color, precio);
        setAnguloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
    }

    public double getAnguloVision() {
        return this.anguloVision;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public double getTiempoRespuesta() {
        return this.tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}