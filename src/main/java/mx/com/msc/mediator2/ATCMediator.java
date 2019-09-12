package mx.com.msc.mediator2;

public class ATCMediator implements IATCMediator {
    private Vuelo vuelo;
    private Pista pista;
    public boolean aterrizajeExitoso;

    public void registrarPista(Pista pista) {
        this.pista = pista;
    }

    public void registrarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public boolean aterrizajeExitoso() {
        return aterrizajeExitoso;
    }

    @Override
    public void setEstatusAterrizaje(boolean estatus) {
        this.aterrizajeExitoso = estatus;
    }

}