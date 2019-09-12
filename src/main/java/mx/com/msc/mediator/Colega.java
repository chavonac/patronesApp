package mx.com.msc.mediator;

public abstract class Colega {
    protected IMediador mediador;

    public IMediador getMediador() {
        return this.mediador;
    }

    public void setMediador(IMediador m) {
        this.mediador = m;
    }

    public void comunicar(String mensaje){
        this.getMediador().enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}